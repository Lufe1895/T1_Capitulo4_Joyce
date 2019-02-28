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
public class SandwichFilling {
    private String fillingType;
    private Integer calories;
    
    public SandwichFilling(String fillingType,int calories){
        this.calories=calories;
        this.fillingType=fillingType;
    }

    /**
     * @return the fillingType
     */
    public String getFillingType() {
        return fillingType;
    }

    /**
     * @param fillingType the fillingType to set
     */
    public void setFillingType(String fillingType) {
        this.fillingType = fillingType;
    }

    /**
     * @return the calories
     */
    public Integer getCalories() {
        return calories;
    }

    /**
     * @param calories the calories to set
     */
    public void setCalories(Integer calories) {
        this.calories = calories;
    }
    
    
}
