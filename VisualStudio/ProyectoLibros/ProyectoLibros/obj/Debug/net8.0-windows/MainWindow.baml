   M S B A M L   `   `   `  ����I  EProyectoLibros, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null/clr-namespace:ProyectoLibrosProyectoLibros  5   	       ProyectoLibros.MainWindow   5   	   W SPresentationCore, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35e aSystem.Windows.Controls.Ribbon, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089R NWindowsBase, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35F 9http://schemas.microsoft.com/winfx/2006/xaml/presentation     5   	   R NSystem.Xaml, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   .localclr-namespace:ProyectoLibros     5   	     � Title$  
MainWindow��5   	   $	��450��6   $	��800��6)   .��5	      � $��0,0,0,26q�6    � RowDefinitions 5
   
   �� 5      $
��Auto �6   �� 5      $��* �6   .+�5   
   o� $��	0,0,0,393q�6   .@�5      m� -   5         m�Name$ btnCrear��5      $��Crear��6)   $��35��68   $��82��6D   $��20(�6O   $
��Bold"�6]   .@�5      m� -   5        $ btnJuego��5      $��Libro��6-   6<   5      5      &   System.Windows.Controls.DataGrid  5   
   -   5          Name$ tablaLibros��5      $��	0,72,0,72q�6Q      AutoGenerateColumns$
 True��6d   ��6(   ��  �� Path$ listaLibros�6d   �� 5   
   -   5        $��	Modificar��5      $
��Left=�6%   $��675,375,0,0q�6@   $	��Top=�6U   $	��115��6m   6y   5      5      