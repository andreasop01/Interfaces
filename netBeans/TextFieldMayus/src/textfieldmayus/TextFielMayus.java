/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfieldmayus;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author Tarde
 */
public class TextFielMayus extends JTextField implements Serializable{
    private boolean mayus;

    public boolean isMayus() {
        return mayus;
    }

    public void setMayus(boolean mayus) {
        this.mayus = mayus;
    }

    public TextFielMayus() {
        
        this.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyReleased(KeyEvent e) {
                if(mayus){
                    setText(getText().toUpperCase());
                }
            }
            
        });
    }
    
    
}
