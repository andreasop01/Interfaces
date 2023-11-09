package coloresandrea;


import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tarde
 */
public class TextFieldColoresAndrea extends JTextField implements Serializable{
    
    private Colores colorFondo;
    private Integer nCaracteres;

    public TextFieldColoresAndrea() {
        colorFondo=new Colores(Color.WHITE,Color.BLACK);
        this.setBackground(colorFondo.getColorFondo());
        this.setForeground(colorFondo.getColorTexto());
        
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if(getText().length()>=nCaracteres){
                    
                    Color fondo=colorFondo.getColorFondo();
                    Color texto=colorFondo.getColorTexto();
                    setBackground(fondo);
                    setForeground(texto);
                }else{
                    setBackground(Color.WHITE);
                    setForeground(Color.BLACK);
                }
            }
            
        });
        
           
    }

    public Colores getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(Colores colorFondo) {
        this.colorFondo = colorFondo;
    }

    public int getnCaracteres() {
        return nCaracteres;
    }

    public void setnCaracteres(int nCaracteres) {
        this.nCaracteres = nCaracteres;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        
        if(nCaracteres==null){
            nCaracteres=0;
            
        }
        
    }

   
    
    
    
}
