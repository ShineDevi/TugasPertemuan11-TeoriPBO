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
public class TelevisiJadul extends Elektronik{
    private String modelInput;
    TelevisiJadul(){
        super();
    }

    public void setModelInput(String modelInput) {
        this.modelInput = modelInput;
    }

    public void setVoltase(int voltase) {
        this.voltase = voltase;
    }

    public String getModelInput() {
        return modelInput;
    }

    public int getVoltase() {
        return voltase;
    }
    
}
