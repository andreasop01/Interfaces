/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_examen2_andreallovera;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.Serializable;


import javax.swing.JTextField;

/**
 *
 * @author Tarde
 */
public class ValorTextArea extends JTextField implements Serializable{
    
    private boolean valor;
    

    public boolean getValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
    }

    public ValorTextArea(boolean valor) {
        this.valor = valor;
    }

    public ValorTextArea() {
        
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                
                 if(valor){
                    
                }
                super.keyReleased(e); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        
    }

   
    
    
}
