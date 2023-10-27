/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import dtos.tareas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Tarde
 */
public class TareaTableModel extends AbstractTableModel {
    private ArrayList<tareas> listarea;
    private String[] columnas = {"nombre", "Descripcion", "Asignatura", "Fecha de Inicio","Fecha de Entrega"};
    
    public TareaTableModel(ArrayList<tareas> listarea) {
        this.listarea= listarea;
    }
    
    @Override
    public int getRowCount() {
        return this.listarea.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }


    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return this.listarea.get(rowIndex).getNombre();
            case 1:
                return this.listarea.get(rowIndex).getDescripcion();
            case 2:
                return this.listarea.get(rowIndex).getAsignaturas();
            case 3:
                return this.listarea.get(rowIndex).getFechaInicio();
            case 4:
                return this.listarea.get(rowIndex).getFechaFin();
        }
        return null;
    }
    
    public String getColumnName(int column) {
        return this.columnas[column];
    }
}
