package propertyeditorcolores;


import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.JTextField;
import java.awt.Color;
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
    private int nCaracteres;

    public TextFieldColoresAndrea() {
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
        
        if(colorFondo!=null){
            Color fondo=colorFondo.getColorFondo();
            Color texto=colorFondo.getColorTexto();
            this.setBackground(fondo);
            this.setForeground(texto);
        }
        
    }

   
    
    
    
}
