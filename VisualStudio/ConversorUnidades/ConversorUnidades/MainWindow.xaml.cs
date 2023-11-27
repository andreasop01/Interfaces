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

        private void ComboBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {

        }
    }
}