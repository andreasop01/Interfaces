using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Prueba1.dto
{
   public class Persona
    {
        public String nombre { get; set; }
        public string apellido{ get; set; }

        public Persona(String nombre, string apellido)
        {
            this.nombre = nombre;
            this.apellido = apellido;
        }


        public override string ToString()
        {
            return nombre+" "+apellido;
        }

    }
}
