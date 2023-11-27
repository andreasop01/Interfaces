/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_examen2_andreallovera;

/**
 *
 * @author Tarde
 */
public class Datos {
    
    private int reultado;
    private boolean acierto;
    private int id;

    public Datos(int reultado, boolean acierto, int id) {
        this.reultado = reultado;
        this.acierto = acierto;
        this.id = id;
    }
    
    
    

    public int getReultado() {
        return reultado;
    }

    public void setReultado(int reultado) {
        this.reultado = reultado;
    }

    public boolean isAcieto() {
        return acierto;
    }

    public void setAcieto(boolean acieto) {
        this.acierto = acieto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
