/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botonbd;

import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author Tarde
 */
public class BotonBD extends JButton implements Serializable {
    
    private boolean cambiante;

    public boolean isCambiante() {
        return cambiante;
    }

    public void setCambiante(boolean cambiante) {
        this.cambiante = cambiante;
    }

    public BotonBD(boolean cambiante) {
        this.cambiante=cambiante;
    }

    public BotonBD() {
        
        
    }
   
    
    
}
