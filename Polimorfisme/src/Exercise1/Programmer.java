/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

/**
 *
 * @author -LENOVO-
 */
public class Programmer extends Pegawai{
    private int bonus;
    Programmer(String nama, int gaji, int bonus){
        super(nama, gaji);
        this.bonus=bonus;
    }

    @Override
    public int getGaji() {
        return gaji;
    }

    public int getBonus() {
        return bonus;
    }
    
}
