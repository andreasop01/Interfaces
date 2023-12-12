using AndreaLloveraPractica01.dto;
using AndreaLloveraPractica01.logic;
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

namespace AndreaLloveraPractica01
{
    /// <summary>
    /// Lógica de interacción para CrearEmpleado.xaml
    /// </summary>
    public partial class CrearEmpleado : Window 
    {

        private LogicaEmpleado logicaEmpleado;
        private Empleados empleados;
       
        public CrearEmpleado(LogicaEmpleado e)
        {
            InitializeComponent();
            this.logicaEmpleado = e;
            this.empleados = new Empleados();
            this.DataContext = empleados;
        }

        public CrearEmpleado()
        {
            InitializeComponent();
         
        }
        private void Button_Click(object sender, RoutedEventArgs e)
        {
            this.logicaEmpleado.agregarEmpleado(empleados);
            this.Close();
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            this.Close();
        }
    }
}
