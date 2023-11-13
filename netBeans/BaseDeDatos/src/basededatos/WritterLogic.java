/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

import java.io.File;
import java.io.FileWriter;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.SwingWorker;

/**
 *
 * @author Tarde
 */
public class WritterLogic extends SwingWorker {

    @Override
    protected Object doInBackground() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/basedatos", "root", "1234");
        
        Statement stU=conn.createStatement();
        ResultSet rU=stU.executeQuery("select * from usuarios");
        FileWriter fw=new FileWriter(new File("usuarios.txt"));
        while(rU.next()){
            fw.write("nombre: "+rU.getString(1)+" contraseña: "+rU.getString(2)+" descripcion: "+rU.getString(3)+"\n");
            UserLogic.addUser(new Usuario(rU.getString(2),rU.getString(3),rU.getString(4),rU.getString(5),rU.getInt(1)));
        }
        fw.flush();
        fw.close();
        
        return 1;
        
        
    }
    
}
