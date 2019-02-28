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
public class Bread {
    private String breadType;
    private Integer calories;
    private SandwichFilling sf;
    
    private static String MOTTO="The staff of life.";
    
    public Bread (String breadType,int calories,String fillingType, int calories2){
        this.breadType=breadType;
        this.calories=calories;
        this.sf = new SandwichFilling(fillingType,calories2);
    }
    
    public String toString(){
        return String.format("Filling type: %s\nFilling's calories: %d\nBread Type: %s\nCalories: %d\n%s\n\n",this.sf.getFillingType(),this.sf.getCalories(),this.breadType,this.calories,MOTTO);
    }

    /**
     * @return the breadType
     */
    public String getBreadType() {
        return breadType;
    }

    /**
     * @param breadType the breadType to set
     */
    public void setBreadType(String breadType) {
        this.breadType = breadType;
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

    /**
     * @return the MOTTO
     */
    public static String getMOTTO() {
        return MOTTO;
    }

    /**
     * @param aMOTTO the MOTTO to set
     */
    public static void setMOTTO(String aMOTTO) {
        MOTTO = aMOTTO;
    }
    
    
}
