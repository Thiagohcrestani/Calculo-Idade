/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thiagohc.controler;

import br.com.thiagohc.model.Ano;
import br.com.thiagohc.view.TelaIdade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author thiag
 */
public class ControlerIdade implements ActionListener{
    
private TelaIdade minhaView;

    public ControlerIdade() {
        minhaView = new TelaIdade();
        Ano model = new Ano();
        minhaView.setAno(model);
        this.minhaView.addControlerActionListener(this);
        this.minhaView.setVisible(true);
    }

@Override
    public void actionPerformed(ActionEvent e) {
        if(minhaView != null){
            this.calcularIdade();
        }
    }

    private void calcularIdade() {
        Ano ano = minhaView.getAno();
        ano.getResult();
        minhaView.setAno(ano);
    }
    
    
}
