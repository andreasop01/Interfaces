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

namespace ConversorUnidades
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
            List <String> unidades= new List <String>();
            unidades.Add("Kilos");
            unidades.Add("Gramos");
            unidades.Add("Toneladas");

            foreach (String uni in unidades)
            {
                ComboBoxItem item = new ComboBoxItem();
                item.Content = uni;

                combo1.Items.Add(item);
                
            }

            foreach (String uni in unidades)
            {
                ComboBoxItem item = new ComboBoxItem();
                item.Content = uni;

               
                combo2.Items.Add(item);
            }

        }

       

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            int items1=combo1.SelectedIndex;
            int items2=combo2.SelectedIndex;

            TextBox unidad = (TextBox)txtNumero1;
            int unidades = Int32.Parse(unidad.Text);

            int con=items1 - items2;

            if(con ==0)
            {
                TextBox unidad2= (TextBox)txtNumero2;
                unidad2.Text = unidades + "";

                return;

            }

            if(con >0) 
            {
                double result = unidades / (Math.Pow(1000, con));

                TextBox unidad2 = (TextBox)txtNumero2;
                unidad2.Text = result+"";
            }
            else
            {
                double result = unidades * (Math.Pow(1000, con*-1));

                TextBox unidad2 = (TextBox)txtNumero2;
                unidad2.Text = result + "";
            }

        }

        private void ComboBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {

        }
    }
}