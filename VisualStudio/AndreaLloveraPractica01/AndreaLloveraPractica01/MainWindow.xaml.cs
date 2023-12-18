using AndreaLloveraPractica01.dto;
using AndreaLloveraPractica01.logic;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace AndreaLloveraPractica01
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private LogicaEmpleado logicaEmpleado;
        public MainWindow()
        {
            InitializeComponent();
            logicaEmpleado = new LogicaEmpleado();
            tablaEmple.DataContext = logicaEmpleado;
        }

        private void MenuItem_Click(object sender, RoutedEventArgs e)
        {
            CrearEmpleado dialogo= new CrearEmpleado(logicaEmpleado);
            dialogo.ShowDialog();
        }

        public void TablaEmple_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            
        }

        private void btnModi_Click(object sender, RoutedEventArgs e)
        {

            if (tablaEmple.SelectedIndex == -1)
            {
                MessageBox.Show("Seleciona un libro");
                return;
            }
            Empleados emple = (Empleados)tablaEmple.SelectedItem;
            int posicion = tablaEmple.SelectedIndex;
            CrearEmpleado crearE = new CrearEmpleado(logicaEmpleado, (Empleados)emple.Clone(), posicion);
            crearE.Show();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            if(tablaEmple.SelectedIndex == -1)
            {
                MessageBox.Show("Seleciona un Empleado");
                return;
            }
            
            logicaEmpleado.listaEmpleados.RemoveAt(tablaEmple.SelectedIndex);
    
        }
    }
}