   M S B A M L   `   `   `  ����R  NAndreaLloveraPractica01, Version=1.0.0.0, Culture=neutral, PublicKeyToken=nullA%clr-namespace:AndreaLloveraPractica01AndreaLloveraPractica01  5   	   (    "AndreaLloveraPractica01.MainWindow   5   	   W SPresentationCore, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35e aSystem.Windows.Controls.Ribbon, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089R NWindowsBase, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35F 9http://schemas.microsoft.com/winfx/2006/xaml/presentation     5   	   R NSystem.Xaml, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   7local%clr-namespace:AndreaLloveraPractica01     5   	     � Title$  
MainWindow��5   	   $	��450��6   $	��800��6)   .��5	      �  � RowDefinitions 5
   
   �� 5      $
��Auto �6   �� 5      $��* �6   .+�5   
   o� $��	0,0,0,373q�6   .@�5      m� -   5        $��Crear Empleado��5      $��36��6/   $	��154��6;   $
��Bold"�6G   $��18(�6Y   .@�5      m� $��CrearEmpleado��6   5      5      &   System.Windows.Controls.DataGrid  5   
   -   5          Name$ 
tablaEmple��5      $��135,110,168,94q�6S      AutoGenerateColumns$ false��6k   ��6'   ��  �� Path$ listaEmpleados�   Columns 5      0  *System.Windows.Controls.DataGridTextColumn  5      ,  &System.Windows.Controls.DataGridColumn   Header$ Nombre��6%   1  +System.Windows.Controls.DataGridBoundColumn   Binding 65   �� $ Nombre�  5      $ Apellido��6%    67   �� $ Apellido�  5      $ Puesto��6%    65   �� $ Puesto�4  .System.Windows.Controls.DataGridCheckBoxColumn  5      $
 Alta��6)    67   �� $
 Alta�5      �� 5   
   -   5         ��Name$ btnModi��5      $��	Modificar��6"   $
��Left=�66   $��336,344,0,0q�6Q   $	��Top=�6f   $��25��6~   $��96��6�   6�   �� 5   
   -   5        $ 	btnBorrar��5      $��Borrar��6$   $
��Left=�65   $��460,344,0,0q�6P   $	��Top=�6e   $��25��6}   $��96��6�   6�   5      5       