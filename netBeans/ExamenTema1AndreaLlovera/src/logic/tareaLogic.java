/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import dtos.tareas;
import java.util.ArrayList;

/**
 *
 * @author Tarde
 */
public class tareaLogic {
    private static ArrayList<tareas> listarea = new ArrayList<>();
    
    public static void addUser(tareas t){
        listarea.add(t);
    }
    
    public static ArrayList<tareas> getUsers(){
        return listarea;
    }
}
