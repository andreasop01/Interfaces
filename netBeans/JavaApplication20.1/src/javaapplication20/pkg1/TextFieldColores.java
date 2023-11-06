/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20.pkg1;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sergio
 */
public class TextFieldColores extends JTextField implements Serializable{
    private Colores fondoytexto;
    private Integer numCaracteres;

    public TextFieldColores() {
        
        this.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                
                if (text.length() >= numCaracteres){
                    textField.setBackground(fondoytexto.getFondo());
                    textField.setForeground(fondoytexto.getTexto());
                } else {
                    textField.setBackground(Color.white);
                    textField.setForeground(Color.black);
                }
            }
        });
    }

    public Colores getFondoytexto() {
        return fondoytexto;
    }

    public void setFondoytexto(Colores fondoytexto) {
        this.fondoytexto = fondoytexto;
    }

    public int getNumCaracteres() {
        return numCaracteres;
    }

    public void setNumCaracteres(int numCaracteres) {
        this.numCaracteres = numCaracteres;
    }
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs); 
        
        if(fondoytexto !=null){
            Color fondo = fondoytexto.getFondo();
            Color texto = fondoytexto.getTexto();
            
            this.setBackground(Color.white);
            this.setForeground(Color.black);
        }
        
        if (numCaracteres == null){
            numCaracteres = 0;
        }
    }
    
    
}
