/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentepersonalizado;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author Tarde
 */
public class ImgenFondoPropertyEditor extends PropertyEditorSupport {
    //para hacer el componente personalizado
    
    private ImagenFondoPanel imagenFondoPanel=new ImagenFondoPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Component getCustomEditor() {
        return imagenFondoPanel; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getJavaInitializationString() {
        
        ImagenFondo imagenFondo=imagenFondoPanel.getSelectedValue();
        String ruta= imagenFondo.getRutaImagen().getAbsolutePath();
        ruta=ruta.replace('\\','/');
        
        return "new componentepersonalizado.ImagenFondo("+"new java.io.File(\""+ruta+"\"),"+imagenFondo.getOpacidad()+"f)";
        
    }

    @Override
    public Object getValue() {
        return  imagenFondoPanel.getSelectedValue(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
