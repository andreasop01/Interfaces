using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProyectoLibros.dto
{
    public class Libros : INotifyPropertyChanged,ICloneable,IDataErrorInfo

    {
        public DateTime Fecha
        {
            get
            {
                return fecha;
            }
            set
            {
                this.fecha = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("fecha"));
            }
        }
        public String Autor
        {
            get
            {
                return autor;
            }
            set
            {
                this.autor = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("autor"));
            }
        }

        public String Titulo
        {
            get
            {
                return titulo;
            }
            set
            {
                this.titulo = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("titulo"));
            }
        }

        public string Error {
            get { return ""; }
        }

        public string this[string columnName]
        {
            get
            {
                string resultado = "";
                if (columnName == "Titulo")
                {
                    if (string.IsNullOrEmpty(titulo))
                    {
                        resultado = "debe tener un titulo";
                    }
                }

                if (columnName == "Autor")
                {
                    if (string.IsNullOrEmpty(autor))
                    {
                        resultado = "Debe tener un autor";
                    }
                }
                return resultado;
            }
        }

        private String autor;
        private string titulo;
        private DateTime fecha;

        public Libros(String autor, String titulo ,DateTime fecha)
        {
            this.autor = autor;
            this.titulo = titulo;
            this.fecha = fecha;
        }

        public Libros()
        {
            
            this.fecha = DateTime.Now;
        }

        public event PropertyChangedEventHandler? PropertyChanged;

        public override string ToString()
        {
            return autor + " " + titulo;
        }

        public object Clone()
        {
           return this.MemberwiseClone();
        }
    }
}
