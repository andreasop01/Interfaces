/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfieldmayus;

import textfieldmayus.Valores;
import java.awt.BorderLayout;
import java.io.Serializable;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

/**
 *
 * @author Tarde
 */
public class SliderValor extends JSlider implements Serializable {
    private boolean ValorActualVisible;
    private Valores valores;
    private JLabel valorLabel;

    public SliderValor() {
        
        this.ValorActualVisible=false;
        valores=new Valores();
        
        valorLabel=new JLabel("",SwingConstants.CENTER);
        valorLabel.setBorder(BorderFactory.createEmptyBorder(0,0,50,0));
        
        setLayout(new BorderLayout());
        add(valorLabel,BorderLayout.NORTH);
        
        addChangeListener(l-> {
            actualizarLabel();
            
        });
        
    }

    public Valores getValores() {
        return valores;
    }

    public void setValores(Valores valores) {
        this.valores = valores;
        this.setMaximum(valores.getMax());
        this.setMinimum(valores.getMin());
    }

    
    
    public boolean isValorActualVisible() {
        return ValorActualVisible;
    }

    public void setValorActualVisible(boolean ValorActualVisible) {
        this.ValorActualVisible = ValorActualVisible;
    }

    private void actualizarLabel() {
        
        if(ValorActualVisible){
            valorLabel.setText(String.valueOf(getValue()));
        }else{
            valorLabel.setText("");
        }
    }
    
    
    
}
