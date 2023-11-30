using ProyectoLibros.dto;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProyectoLibros.logic
{
    public class LogicaLibros
    {

        public ObservableCollection<Libros> listaLibros { get; set; }

        public LogicaLibros() { 
            listaLibros=new ObservableCollection<dto.Libros>();

            listaLibros.Add(new Libros("El señor de los anillos", "xxxx", new DateTime(1, 5, 1995)));
            listaLibros.Add(new Libros("El señor de los anillos", "xxxx", new DateTime(1, 5, 1995)));
            listaLibros.Add(new Libros("El señor de los anillos", "xxxx", new DateTime(1, 5, 1995)));
        }

        public void nuevoLibro(Libros l)
        {
            listaLibros.Add(l);
        }
    }
}
