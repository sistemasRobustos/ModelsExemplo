/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controle.DeletarLinha;
import controle.NovaColuna;
import controle.NovaLinha;
import javax.swing.table.DefaultTableModel;
import view.TelaMatris;

/**
 *
 * @author felix
 */
public class Main {
    public static void main(String[] args) {
        TelaMatris tela = new TelaMatris();
        
        DefaultTableModel model = new DefaultTableModel();
        
        tela.getjTable1().setModel(model);
        
        NovaColuna novaColuna = new NovaColuna(model,tela.getjTNomeColuna());
        
        tela.getjBNovaColuna().addActionListener(novaColuna);
        
        NovaLinha novaLinha = new NovaLinha(model);
        
        tela.getjBNovaLinha().addActionListener(novaLinha);
        
        DeletarLinha deletarLinha = new DeletarLinha(model, tela.getjTable1().getSelectionModel());
        
        tela.getjBDeletarLinha().addActionListener(deletarLinha);
        
        tela.setVisible(true);
    }
}
