package componentepersonalizado;


import java.awt.Graphics;
import java.io.File;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tarde
 */
public class ImagenFondo {
    
    private File rutaImagen;
    private float opacidad;
    
    public ImagenFondo(File rutaImagen, float opacidad){
        this.rutaImagen=rutaImagen;
        this.opacidad=opacidad;
        
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public float getOpacidad() {
        return opacidad;
    }

    public void setOpacidad(float opacidad) {
        this.opacidad = opacidad;
    }
    
   
    
    
}
