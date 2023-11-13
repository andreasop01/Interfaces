/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Tarde
 */
public class ImgRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel lb = new JLabel();
        lb.setHorizontalAlignment(JLabel.CENTER);
        
        try {
            ImageIcon icon=new ImageIcon((String)value);
            Image scaleImage=icon.getImage().getScaledInstance(50, 50, WIDTH);
            ImageIcon scaleIcon=new ImageIcon(scaleImage);
            table.setRowHeight(row,50);
            lb.setIcon(scaleIcon);
        } catch (Exception e) {
        }
        
        return lb;
    }
    
    
}
