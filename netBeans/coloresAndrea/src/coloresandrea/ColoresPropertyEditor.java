package coloresandrea;


import java.awt.Component;
import java.beans.PropertyEditorSupport;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tarde
 */
public class ColoresPropertyEditor extends PropertyEditorSupport {
    
    private PanelColoresPrincipal colorFondoPanel=new PanelColoresPrincipal();

    @Override
    public boolean supportsCustomEditor() {
        return true; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Component getCustomEditor() {
        return colorFondoPanel; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getJavaInitializationString() {
        Colores c=colorFondoPanel.getSelectedValues();
         
        
        return "new coloresandrea.Colores(new java.awt.Color("+c.getColorFondo().getRGB()+"),new java.awt.Color("+c.getColorTexto().getRGB()+"))";
        
    }

    
    @Override
    public Object getValue() {
        return  colorFondoPanel.getSelectedValues(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
