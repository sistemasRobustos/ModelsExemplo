/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felix
 */
public class NovaColuna implements ActionListener{

    private DefaultTableModel model;
    
    private JTextField jtNomeColuna;

    public NovaColuna(DefaultTableModel model, JTextField jtNomeColuna) {
        this.model = model;
        this.jtNomeColuna = jtNomeColuna;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("passo");
        
        String nomeCampo = jtNomeColuna.getText();
        
        model.addColumn(nomeCampo);
    }
    
}
