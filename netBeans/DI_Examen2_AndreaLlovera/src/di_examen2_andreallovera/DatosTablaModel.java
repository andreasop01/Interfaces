/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_examen2_andreallovera;

import java.util.ArrayList;

/**
 *
 * @author Tarde
 */
public class DatosTablaModel {
     private ArrayList<Datos> listaDatos;
    private String[] columnas = {"id", "Resultado", "Acierto"};
    
    public DatosTablaModel(ArrayList<Datos> listaDatos) {
        this.listaDatos= listaDatos;
    }
    
    public int getRowCount() {
        return this.listaDatos.size();
    }

    public int getColumnCount() {
        return this.columnas.length;
    }


    
    public Object getValueAt(int rowIndex, int columnIndex) {
        
     
        switch (columnIndex){
            case 0:
                return this.listaDatos.get(rowIndex).getId();
            case 1:
                return this.listaDatos.get(rowIndex).getReultado();
                
            case 2:
                return this.listaDatos.get(rowIndex).isAcieto();
            
        }
        return null;
    }
    
    public String getColumnName(int column) {
        return this.columnas[column];
    }
}
