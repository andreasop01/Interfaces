/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentepersonalizado;

import java.awt.Graphics;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Tarde
 */
public class  PanelImagen extends JPanel implements Serializable {
    
    private File rutaImg;

    public File getRutaImg() {
        return rutaImg;
    }

    public void setRutaImg(File rutaImg) {
        this.rutaImg = rutaImg;
    }
    
    public static void main(String[] args) {
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        
        if(rutaImg!=null && rutaImg.exists()){
            ImageIcon imageIcon=new ImageIcon(rutaImg.getAbsolutePath());
            g.drawImage(imageIcon.getImage(), 0, 0, null);
        }
        
        
    }
    
    
    
}
