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

            listaLibros.Add(new Libros("El señor de los anillos", "xxxx", new DateTime(1995,5,1)));
            listaLibros.Add(new Libros("El señor de los anillos", "xxxx", new DateTime(1995,5,1)));
            listaLibros.Add(new Libros("El señor de los anillos", "xxxx", new DateTime(1995,5,1)));
        }

        public void nuevoLibro(Libros l)
        {
            listaLibros.Add(l);
        }

        public void modificarLibro(Libros l,int posicion)
        {
            listaLibros[posicion] = l;
        }
        
    }
}
    