   M S B A M L   `   `   `  ����R  NAndreaLloveraPractica01, Version=1.0.0.0, Culture=neutral, PublicKeyToken=nullA%clr-namespace:AndreaLloveraPractica01AndreaLloveraPractica01  5   	   +    %AndreaLloveraPractica01.CrearEmpleado   5   	   W SPresentationCore, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35e aSystem.Windows.Controls.Ribbon, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089R NWindowsBase, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35F 9http://schemas.microsoft.com/winfx/2006/xaml/presentation     5   	   R NSystem.Xaml, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   7local%clr-namespace:AndreaLloveraPractica01     5   	     � Title$  CrearEmpleado��5   	   $	��450��6   $	��800��6,   .��5	      � -   5         �Name$
 grid��5	      .+�5
   
   �� $��Nombre��6   $
��Left=�6!   $��165,113,0,0q�6<   $	��Top=�6Q   $
��Bold"�6i   �� 5   
   $��Apellido��6   $
��Left=�6#   $��165,155,0,0q�6>   $	��Top=�6S   $
��Bold"�6k   �� 5   
   $��Puesto��6   $
��Left=�6!   $��	165,0,0,0q�6<   $��Center=�6O   $
��Bold"�6j   �� 5   
   $
��Alta��6   $
��Left=�6   $��165,256,0,0q�6:   $	��Top=�6O   $
��Bold"�6g   �� 5   
   -   5         ��Name$ 	txtNombre��5      $
��Left=�6%   $��247,121,0,0q�6@    �� TextWrapping$
 Wrap=�6U   $	��Top=�6�   $	��120��6�   ��6�   ��  �� Path$ Nombre� �� NotifyOnValidationError$
 True�� �� ValidatesOnDataErrors$
 True��6�   �� 5   
   -   5        $ txtApellido��5      $
��Left=�6'   $��247,155,0,0q�6B   $
 Wrap=�6W   $	��Top=�6�   $	��120��6�   ��6�   �� $ Apellido�$
 True��$
 True��6�   �� 5   
   -   5        $ 	txtPuesto��5      $
��Left=�6%   $��247,204,0,0q�6@   $
 Wrap=�6U   $	��Top=�6�   $	��120��6   ��6�   �� $ PuestoEmpleo�$
 True��$
 True��6   �� 5   
   -   5         ��Name$ 	checkAlta��5      $�� ��6&   $
��Left=�61   $��247,262,0,0q�6L   $	��Top=�6�    d� 	IsChecked 6a   �� $
 Alta�6�   �� 5   
   -   5        	 ��Name$	 btnCrear��5      $��Crear��6#   $
��Left=�63   $��165,359,0,0q�6N   $	��Top=�6c   $��29��6{   $��82��6�   6�   �� 5   
   -   5        $	 btnCancelar��5      $��Cancelar��6&   $��Center=�69   $��	0,356,0,0q�6V   $	��Top=�6i   $��32��6�   $	��102��6�   6�   �� 5   
   -   5        $��Selecciona una Imagen��5      $
��Left=�61   $��144,302,0,0q�6L   $	��Top=�6a   $��30��6y   $	��163��6�   6�   �� 5   
   -	   5        $ txtImg��5      $
��Left=�6"   $��337,302,0,0q�6=   $
 Wrap=�6R   $	��Top=�6�   $	��204��6�   $��24��6  
 J� RenderTransformOrigin$
 
0.47,0.097&�6  ��6�   �� $ RutaImg�$
 True��$
 True��6  �� 5   
   -
   5         ��Name$
 imgT��5      $
��Left=�6   $	��100��69   $��623,256,0,0q�6F   $	��Top=�6[   $	��100��6s   5      5      