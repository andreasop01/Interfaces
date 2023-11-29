using System;
using System.Collections.Generic;
using System.Collections.Specialized;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataGrid__Tabla_.dto
{
   public class Persona : INotifyPropertyChanged


    {
        public String Nombre
        {
            get
            {
                return nombre;
            }
            set
            {
                this.nombre = value;
                this.PropertyChanged(this,new PropertyChangedEventArgs("nombre"));
            }
        }

        public String Apellido
        {
            get
            {
                return apellido;
            }
            set
            {
                this.apellido = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("apellido"));
            }
        }



        private String nombre;
        private string apellido;

        public Persona(String nombre, string apellido)
        {
            this.nombre = nombre;
            this.apellido = apellido;
        }

        public event PropertyChangedEventHandler? PropertyChanged;

        public override string ToString()
        {
            return nombre+" "+apellido;
        }

    }
}
