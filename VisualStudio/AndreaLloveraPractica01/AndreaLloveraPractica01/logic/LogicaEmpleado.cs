using AndreaLloveraPractica01.dto;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AndreaLloveraPractica01.logic
{
    public class LogicaEmpleado
    {
        public ObservableCollection<Empleados> listaEmpleados { get; set; }

        public LogicaEmpleado()
        {
            listaEmpleados = new ObservableCollection<dto.Empleados>();
            listaEmpleados.Add(new Empleados("Andrea", "Llovera", "Programadora", true, "https://www.google.com/url?sa=i&url=https%3A%2"));
            listaEmpleados.Add(new Empleados("Sergio", "Ballesteros", "Programador", true, "https://www.google.com/url?sa=i&url=https%3A%2"));
            listaEmpleados.Add(new Empleados("Jorge", "Garcia", "Programador", false, "https://www.google.com/url?sa=i&url=https%3A%2"));
        }

        public void agregarEmpleado(Empleados e)
        {
            listaEmpleados.Add(e);
        }

    }
}
