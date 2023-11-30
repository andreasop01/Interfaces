using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProyectoLibros.dto
{
    public class Libros : INotifyPropertyChanged

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

    }
}
