/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felix
 */
public class DeletarLinha implements ActionListener{

    private DefaultTableModel model;
    
    private ListSelectionModel modeloSelecao;

    public DeletarLinha(DefaultTableModel model, ListSelectionModel modeloSelecao) {
        this.model = model;
        this.modeloSelecao = modeloSelecao;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        model.removeRow(modeloSelecao.getMaxSelectionIndex());
    }
    
}
