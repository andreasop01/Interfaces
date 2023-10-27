/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2bombaAndreaLlovera;

import java.util.Random;
import javax.swing.SwingWorker;

/**
 *
 * @author Tarde
 */
public class Contador extends SwingWorker {

    @Override
    protected Object doInBackground() throws Exception {
        int numero = 0;
       
        while(numero < 60){
            if (isCancelled()){
                return numero;
            }
            
            numero++;
            Thread.sleep(1000);
            setProgress(numero);
        }
        return numero;
    }
   
}
