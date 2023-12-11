using ProyectoLibros.dto;
using ProyectoLibros.logic;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace ProyectoLibros
{
    /// <summary>
    /// Lógica de interacción para Window1.xaml
    /// </summary>
    public partial class DialogoLibro: Window
    {
        private LogicaLibros logicaLibros;
        public Libros libros;
        private int posicion;
        private bool modificar;
        private int error = 0;
        public DialogoLibro(LogicaLibros l)
        {
            InitializeComponent();
            this.logicaLibros =  l;
            libros = new Libros();
            this.DataContext = libros;
            modificar = false;
        }

        public DialogoLibro(LogicaLibros l,Libros libros,int posicion)
        {
            InitializeComponent();
            this.logicaLibros = l;
            this.libros = libros;
            this.DataContext = libros;
            modificar = true;
            this.posicion = posicion;
        }

        public DialogoLibro()
        {
            InitializeComponent();
           
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            if (modificar)
            {
                this.logicaLibros.modificarLibro(libros,posicion);
            }else
            {
                this.logicaLibros.nuevoLibro(libros);
            }
            
            this.Close();
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void Validation_Error(object sender,ValidationErrorEventArgs e)
        {
            if(e.Action==ValidationErrorEventAction.Added)
            {
                error++;
            }
            else
            {
                error--;
            }
            if(error == 0)
            {
                btnAgregar.IsEnabled = true;
            }
            else
            {
                btnAgregar.IsEnabled=false;
            }
        }
    }
}
