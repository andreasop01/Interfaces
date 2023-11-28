using Prueba1.dto;
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

namespace Prueba1
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public ObservableCollection<Persona> listPersona {  get; set; }
        public MainWindow()
        {
            InitializeComponent();
            listPersona = new ObservableCollection<Persona>();
            listPersona.Add(new Persona("Alejandro","Sanz"));
            listPersona.Add(new Persona("Antonio", "Bandera"));
            this.DataContext = this;

        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            if(l1.Visibility == Visibility.Visible)
            {
                l1.Visibility = Visibility.Hidden;

            }
            else
            {
                l1.Visibility = Visibility.Visible;
            }
        }

        private void personaCombo_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            ComboBoxItem cb=(ComboBoxItem) personaCombo.SelectedItem;
            Persona persona=(Persona)cb.Content;
            lNombre.Content = persona.nombre;
            lApellido.Content = persona.apellido;
        }
    }
}