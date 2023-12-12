using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AndreaLloveraPractica01.dto
{
    public class Empleados: INotifyPropertyChanged
    {
        private String nombre;
        private String apellido;
        private String puestoEmpleo;
        private bool alta;
        private String rutaImg;

        public event PropertyChangedEventHandler? PropertyChanged;

        public String Nombre
        {
            get { return nombre; }
            set
            {
                nombre = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("nombre"));
            }
        }
        public String Apellido
        {
            get { return apellido; }
            set
            {
                apellido = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("apellido"));
            }
        }
        public String PuestoEmpleo
        {
            get { return puestoEmpleo; }
            set
            {
                puestoEmpleo = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("puestoEmpleo"));
            }
        }
        public bool Alta
        {
            get { return alta; }
            set
            {
                alta = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("alta"));
            }
        }
        public String RutaImg
        {
            get { return rutaImg; }
            set
            {
                rutaImg = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("rutaImg"));
            }
        }

        public Empleados(String nombre, String apellido, String puestoEmpleo, bool alta, String rutaImg)
        {
            this.nombre = nombre;
            this.apellido = apellido;
            this.puestoEmpleo = puestoEmpleo;
            this.alta = alta;
            this.rutaImg = rutaImg;
        }

        public Empleados()
        {
           
        }


        public override string ToString()
        {
            return nombre + " " + apellido + " " + puestoEmpleo + " " + alta + " " + rutaImg;
        }
    
    }
}
