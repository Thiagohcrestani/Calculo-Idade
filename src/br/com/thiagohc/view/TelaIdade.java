/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thiagohc.view;

import br.com.thiagohc.model.Ano;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author thiag
 */
public class TelaIdade extends JFrame implements ActionListener {
 
    private Ano result;
    private JTextField txtAnoNasc, txtAnoAt, txtResultado;
    private JButton btnCalcular;

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    public TelaIdade() throws HeadlessException {
        setLayout(new GridLayout(0,2));
        txtAnoNasc = new JTextField();
        txtAnoAt = new JTextField();
        txtResultado = new JTextField();
        txtResultado.setEditable(false);
        btnCalcular = new JButton("Calcular");
        
        this.add(new JLabel("Ano Nascimento"));
        this.add(txtAnoNasc);
        
        this.add(new JLabel("Ano Atual"));
        this.add(txtAnoAt);
        
        this.add(new JLabel("Resultado"));
        this.add(txtResultado);
        
        this.add(btnCalcular);
        btnCalcular.addActionListener(this);
        this.pack();
        this.setLocationRelativeTo(null);
        
        
    }

    public Ano getAno() {
        result.setAn(Double.parseDouble(txtAnoNasc.getText()));
        result.setAt(Double.parseDouble(txtAnoAt.getText()));
        return result;
    }

    public void setAno(Ano result) {
        if (result.getAn() > 0){
            txtResultado.setText(Double.toString(result.getResult()));
        }
        
        this.result = result;
    }
    
    public void addControlerActionListener(ActionListener al){
        btnCalcular.addActionListener(al);
    }
    
}