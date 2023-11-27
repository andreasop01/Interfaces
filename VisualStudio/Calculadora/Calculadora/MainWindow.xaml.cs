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

namespace Calculadora
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void TextBox_TextChanged(object sender, TextChangedEventArgs e)
        {

        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            TextBox numero1 = (TextBox)txtNumero1;
            TextBox numero2 = (TextBox)txtNumero2;

            int n1=Int32.Parse(numero1.Text);
            int n2=Int32.Parse(numero2.Text);

            lRespuesta.Content = n1 + n2;
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            TextBox numero1 = (TextBox)txtNumero1;
            TextBox numero2 = (TextBox)txtNumero2;

            int n1 = Int32.Parse(numero1.Text);
            int n2 = Int32.Parse(numero2.Text);

            lRespuesta.Content = n1 - n2;

        }

        private void btnMulti_Click(object sender, RoutedEventArgs e)
        {
            TextBox numero1 = (TextBox)txtNumero1;
            TextBox numero2 = (TextBox)txtNumero2;

            int n1 = Int32.Parse(numero1.Text);
            int n2 = Int32.Parse(numero2.Text);

            lRespuesta.Content = n1 * n2;
        }

        private void btnDividir_Click(object sender, RoutedEventArgs e)
        {
            TextBox numero1 = (TextBox)txtNumero1;
            TextBox numero2 = (TextBox)txtNumero2;

            int n1 = Int32.Parse(numero1.Text);
            int n2 = Int32.Parse(numero2.Text);

            lRespuesta.Content = n1 /n2;
        }
    }
}