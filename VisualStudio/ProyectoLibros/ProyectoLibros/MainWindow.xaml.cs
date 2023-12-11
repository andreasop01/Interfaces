using ProyectoLibros.dto;
using ProyectoLibros.logic;
using System.Collections;
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

namespace ProyectoLibros
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    /// 
    public partial class MainWindow : Window
    {
        private LogicaLibros logica;
        public MainWindow()
        {
            InitializeComponent();
            logica=new LogicaLibros();
            tablaLibros.DataContext = logica;

        }


        private void MenuItem_Click_1(object sender, RoutedEventArgs e)
        {
            DialogoLibro dialog = new DialogoLibro(logica);
            dialog.Show();
        }

        private void tablaLibros_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {

        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            if(tablaLibros.SelectedIndex ==-1) {
                MessageBox.Show("eleciona un libro");
                return;
            }
            Libros libros=(Libros) tablaLibros.SelectedItem;
            int posicion = tablaLibros.SelectedIndex;
            DialogoLibro dialogo = new DialogoLibro(logica, (Libros) libros.Clone(), posicion);
            dialogo.Show();
        }
    }
}