   M S B A M L   `   `   `  ����I  EProyectoLibros, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null/clr-namespace:ProyectoLibrosProyectoLibros  5   	   !    ProyectoLibros.DialogoLibro   5   	   W SPresentationCore, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35e aSystem.Windows.Controls.Ribbon, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089R NWindowsBase, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35F 9http://schemas.microsoft.com/winfx/2006/xaml/presentation     5   	   R NSystem.Xaml, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   .localclr-namespace:ProyectoLibros     5   	     � Title$  DialogoLibro��5   	   $	��450��6   $	��800��6+   .��5	      � .+�5
   
   �� $��Titulo��6   $
��Left=�6!   $��	95,84,0,0q�6<   $	��Top=�6O   $��31��6g   $��82��6s   $
��Bold"�6~   �� 5   
   $��Autor��6   $
��Left=�6    $��
95,131,0,0q�6;   $	��Top=�6O    J� RenderTransformOrigin$ -0.162,-0.164&�6g   $
��Bold"�6�   �� 5   
   $��Fecha de Creacion��6   $
��Left=�6,   $��
98,182,0,0q�6G   $	��Top=�6[   $
��Bold"�6s   �� 5   
   -   5         ��Name$ 	txtTitulo��5      $
��Left=�6%   $��
247,91,0,0q�6@    �� TextWrapping$
 Wrap=�6T   $	��Top=�6�   $	��120��6�   ��6�   ��  �� Path$ Titulo� �� NotifyOnValidationError$
 True�� �� ValidatesOnDataErrors$
 True��6�   �� 5   
   -   5        $ txtAutor��5      $
��Left=�6$   $��247,139,0,0q�6?   $
 Wrap=�6T   $	��Top=�6�   $	��120��6�   ��6�   �� $ Autor�$
 True��$
 True��6�   �� 5   
   -   5         ��Name$ 
btnAgregar��5      $��Agregar��6%   $
��Left=�67   $��154,300,0,0q�6R   $	��Top=�6g   $��36��6   $��96��6�   6�   �� 5   
   -   5        $��Cancelar��5      $
��Left=�6$   $��297,300,0,0q�6?   $	��Top=�6T   $��36��6l   $	��122��6x   6�   (  "System.Windows.Controls.DatePicker  5   
   -   5          Name$ 	dateFecha��5      $
��Left=�6L   $��247,182,0,0q�6g   $	��Top=�6|   	   SelectedDate	 6(   �� $ Fecha�6|   5      5      