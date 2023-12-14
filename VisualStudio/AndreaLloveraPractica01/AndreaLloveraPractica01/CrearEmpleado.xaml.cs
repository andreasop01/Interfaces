using AndreaLloveraPractica01.dto;
using AndreaLloveraPractica01.logic;
using Microsoft.Win32;
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
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace AndreaLloveraPractica01
{
    /// <summary>
    /// Lógica de interacción para CrearEmpleado.xaml
    /// </summary>
    public partial class CrearEmpleado : Window 
    {

        private LogicaEmpleado logicaEmpleado;
        private Empleados empleados;
        private int error = 0;

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

        private void Validation_Error(object sender, ValidationErrorEventArgs e)
        {
            if (e.Action == ValidationErrorEventAction.Added)
            {
                error++;
            }
            else
            {
                error--;
            }
            if (error == 0)
            {
                btnCrear.IsEnabled = true;
            }
            else
            {
                btnCrear.IsEnabled = false;
            }
        }

        private void Button_Click_2(object sender, RoutedEventArgs e)
        {
            OpenFileDialog openFileDialog = new OpenFileDialog();
            if(openFileDialog.ShowDialog() == true)
            {
                txtImg.Text = openFileDialog.FileName;
                imgT.Source = new BitmapImage(new Uri(openFileDialog.FileName));

            }
               
        }
    }
}
