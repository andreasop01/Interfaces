/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_examen2_andreallovera;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingWorker;

/**
 *
 * @author Tarde
 */
public class LogicaPrimos extends SwingWorker{
    private PaginaPrincipal p=new PaginaPrincipal();
    @Override
    protected Object doInBackground() throws Exception {
        int primerNumero=0;
        int  UltimoNumero=0;
         
        int divisores = 0;
        
        for (int i = 2; i < primerNumero; i++) {
           if (primerNumero % i == 0) {
                divisores++;
            }
           
           Thread.sleep(1000);
            setProgress(divisores);
        }
            
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examen2","root","1234");
            
            Statement st=con.createStatement();
            String sql="INSERT INTO usuarios (nombre,password) VALUES('"+ divisores+"'')";
            int row=st.executeUpdate(sql);
            
            if(row>0){
                System.out.println("Suma correcta");
            }
            
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaginaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PaginaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return divisores;
    }

    void addPropertyChangeListener(PaginaPrincipal aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
