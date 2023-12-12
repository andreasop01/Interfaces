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
    }
}