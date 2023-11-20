/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfieldmayus;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author Tarde
 */
public class PropertyEditorValores extends PropertyEditorSupport {
    
    private ValorPanel panel=new ValorPanel();
    
    @Override
    public boolean supportsCustomEditor() {
        return true; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Component getCustomEditor() {
        return panel; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getJavaInitializationString() {
        Valores v=panel.getSelectedValues();
         
        
        return "new textfieldmayus.Valores("+v.getMax()+","+v.getMin()+")";
        
    }

    
    @Override
    public Object getValue() {
        return  panel.getSelectedValues(); //To change body of generated methods, choose Tools | Templates.
    }
}
