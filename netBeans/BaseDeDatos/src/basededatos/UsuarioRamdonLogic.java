/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.SwingWorker;

/**
 *
 * @author Tarde
 */
public class UsuarioRamdonLogic extends SwingWorker{

    @Override
    protected Object doInBackground() throws Exception {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/basedatos", "root", "1234");
            
            Statement st = conn.createStatement();
            String sql="SELECT COUNT(*) FROM usuarios";
            ResultSet rs = st.executeQuery(sql);
            Random r;  
            
            if(rs.next()){
                r=new Random(rs.getInt(0));
                r.nextInt();
            }
            
            if(rs.next()){
                
            }
        
        
    }
    
}
