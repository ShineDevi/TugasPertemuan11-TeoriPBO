/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

/**
 *
 * @author -LENOVO-
 */
public class Manusia {
    public void nyalakanPerangkat(Elektronik perangkat){
        if (perangkat instanceof TelevisiJadul) {
            ((TelevisiJadul)perangkat).setModelInput("DVI");
            System.out.println("Nyalakan TV jadul dengan input: "+((TelevisiJadul)perangkat).getModelInput());
            ((TelevisiJadul)perangkat).setVoltase(220);
            System.out.println("Voltase televisi: "+((TelevisiJadul)perangkat).getVoltase());
            
        } else if (perangkat instanceof TelevisiModern){
            ((TelevisiModern)perangkat).setModelInput("HDMI");
            System.out.println("Nyalakan TV modern dengan input: "+((TelevisiModern)perangkat).getModelInput());
            ((TelevisiModern)perangkat).setVoltase(220);
            System.out.println("Voltase televisi: "+((TelevisiModern)perangkat).getVoltase());
        }
    }
}
