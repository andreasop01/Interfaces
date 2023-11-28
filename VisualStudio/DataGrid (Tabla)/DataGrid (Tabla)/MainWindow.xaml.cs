using DataGrid__Tabla_.dto;
using System.Collections.ObjectModel;
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

namespace DataGrid__Tabla_
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public ObservableCollection<Persona> listaPersona { get; set; }
        public MainWindow()
        {
            InitializeComponent();

            listaPersona = new ObservableCollection<Persona>();
            listaPersona.Add (new Persona("Antonio","Banderas"));
            listaPersona.Add(new Persona("Camaron", "Camaron"));

            this.DataContext = this;
        }

        private void DataGrid_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {

        }

        private void btnAgregar_Click(object sender, RoutedEventArgs e)
        {
            TextBox txtNombre1 = (TextBox)txtNombre;
            TextBox txtApe1 = (TextBox)txtApe;

            listaPersona.Add(new Persona(txtNombre1.Text, txtApe1.Text));
            
        }

        private void btnBorrar_Click(object sender, RoutedEventArgs e)
        {   
            int fila=tabla.SelectedIndex;
            listaPersona.RemoveAt(fila);
        }
    }
}