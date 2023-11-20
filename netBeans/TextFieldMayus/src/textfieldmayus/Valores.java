/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfieldmayus;

import java.io.Serializable;

/**
 *
 * @author Tarde
 */
public class Valores implements Serializable {
    private int min;
    private int max;

    public Valores(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public Valores() {
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    
  
    
    
    
    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
    
    
}
