/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4;

/**
 *
 * @author luisl
 */
public class Sandwich {
    private Bread bd;
    
    public Sandwich(String breadType, int calories, String fillingType,int calories2){
        bd=new Bread(breadType,calories,fillingType,calories2);
    }

    /**
     * @return the bd
     */
    public Bread getBd() {
        return bd;
    }

    /**
     * @param bd the bd to set
     */
    public void setBd(Bread bd) {
        this.bd = bd;
    }
    
}
