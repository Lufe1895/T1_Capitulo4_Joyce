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
public class BloodData {
    
    private BloodType bloodType;
    private Factor factor;
    
    public BloodData(){
        this.bloodType = BloodType.O;
        this.factor = Factor.POSITIVO;
    }
    
    public BloodData(BloodType bloodType, Factor factor){
        this.bloodType=bloodType;
        this.factor=factor;
    }

    /**
     * @return the bloodType
     */
    public BloodType getBloodType() {
        return bloodType;
    }

    /**
     * @param bloodType the bloodType to set
     */
    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    /**
     * @return the factor
     */
    public Factor getFactor() {
        return factor;
    }

    /**
     * @param factor the factor to set
     */
    public void setFactor(Factor factor) {
        this.factor = factor;
    }
    
}
