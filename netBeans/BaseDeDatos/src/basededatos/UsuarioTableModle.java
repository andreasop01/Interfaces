/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tarde
 */
public class UsuarioTableModle extends AbstractTableModel {
     private ArrayList<Usuario> listaUsuario;
    private String[] columnas = {"nombre", "Contraseña", "Descripcion", "Img"};
    
    public UsuarioTableModle(ArrayList<Usuario> listaUsuario) {
        this.listaUsuario= listaUsuario;
    }
    
    @Override
    public int getRowCount() {
        return this.listaUsuario.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }


    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return this.listaUsuario.get(rowIndex).getNombre();
            case 1:
                return this.listaUsuario.get(rowIndex).getPassword();
                
            case 2:
                return this.listaUsuario.get(rowIndex).getDescripcion();
            case 3:
                return this.listaUsuario.get(rowIndex).getImg();
        }
        return null;
    }
    
    public String getColumnName(int column) {
        return this.columnas[column];
    }
}
