using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AndreaLloveraPractica01.dto
{
    public class Empleados: INotifyPropertyChanged, ICloneable, IDataErrorInfo
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

        public string Error
        {
            get { return ""; }
        }
           

        public string this[string columnName]
        {
            get
            {
                string resultado = "";
                if (columnName == "Nombre")
                {
                    if (string.IsNullOrEmpty(nombre))
                    {
                        resultado = "debe tener un nombre";
                    }
                }

                if (columnName == "Apellido")
                {
                    if (string.IsNullOrEmpty(apellido))
                    {
                        resultado = "Debe tener un apellido";
                    }
                }

                if (columnName == "PuestoEmpleo")
                {
                    if (string.IsNullOrEmpty(puestoEmpleo))
                    {
                        resultado = "Debe tener un Puesto Empleo";
                    }
                }

                if (columnName == "RutaImg")
                {
                    if (string.IsNullOrEmpty(rutaImg))
                    {
                        resultado = "Debe tener un RutaImg";
                    }
                }

                return resultado;
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
            this.nombre = "";
            this.apellido = "";
            this.puestoEmpleo = "";
            this.alta = false;
            this.rutaImg = "";
        }


        public override string ToString()
        {
            return nombre + " " + apellido + " " + puestoEmpleo + " " + alta + " " + rutaImg;
        }

        public object Clone()
        {
            return this.MemberwiseClone();
        }
    }
}
