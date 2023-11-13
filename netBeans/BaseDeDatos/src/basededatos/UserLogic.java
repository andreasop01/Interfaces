/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

import java.util.ArrayList;

/**
 *
 * @author Tarde
 */
public class UserLogic {
    private static ArrayList<Usuario> listaUsuario = new ArrayList<>();
    
    public static void addUser(Usuario t){
        listaUsuario.add(t);
    }
    
    public static ArrayList<Usuario> getUsers(){
        return listaUsuario;
    }
}
