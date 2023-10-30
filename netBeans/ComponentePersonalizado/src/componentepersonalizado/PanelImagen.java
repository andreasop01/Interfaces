/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentepersonalizado;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Tarde
 */
public class  PanelImagen extends JPanel implements Serializable {
    
    private ImagenFondo rutaImg;

    public  ImagenFondo getRutaImg() {
        return rutaImg;
    }

    public void setRutaImg( ImagenFondo rutaImg) {
        this.rutaImg = rutaImg;
    }
    
    public static void main(String[] args) {
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        
        if(rutaImg!=null){ 
            if(rutaImg.getRutaImagen()!=null && rutaImg.getRutaImagen().exists()){
                
                ImageIcon imageIcon=new ImageIcon(rutaImg.getRutaImagen().getAbsolutePath());
                Graphics2D g2d= (Graphics2D) g;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,rutaImg.getOpacidad()));
                g.drawImage(imageIcon.getImage(), 0, 0, null);
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,1));
            }
            
            
        }
       
        
        
    }
    
    
    
}
