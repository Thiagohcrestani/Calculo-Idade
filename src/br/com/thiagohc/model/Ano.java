/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thiagohc.model;

/**
 *
 * @author thiag
 */
public class Ano {
    private double An;
    private double At;

    public double getAn() {
        return An;
    }

    public void setAn(double An) {
        this.An = An;
    }

    public double getAt() {
        return At;
    }

    public void setAt(double At) {
        this.At = At;
    }
    
     public double getResult() {
        
        return At - An;
}
}
