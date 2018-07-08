/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felix
 */
public class NovaLinha implements ActionListener{

    private DefaultTableModel model;

    public NovaLinha(DefaultTableModel model) {
        this.model = model;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        Vector vetor = new Vector(model.getColumnCount());
        
        model.addRow(vetor);
    }
    
    
}
