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
public class DatosLogic {
    private static ArrayList<Datos> listaUsuario = new ArrayList<>();
    
    public static void addUser(Datos t){
        listaUsuario.add(t);
    }
    
    public static ArrayList<Datos> getUsers(){
        return listaUsuario;
    }
}
