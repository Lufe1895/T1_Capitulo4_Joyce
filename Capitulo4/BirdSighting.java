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
public class BirdSighting {
    private String specie;
    private Integer number;
    private Integer day;
    
    public BirdSighting(){
        specie="robin";
        number=1;
        day=1;
    }
    
    public BirdSighting(String specie,int number,int day){
        this.specie=specie;
        this.number=number;
        this.day=day;
    }
    
    public BirdSighting crear(String specie,int number,int day){
       BirdSighting bd= new BirdSighting(specie,number,day);
       return bd;
    }

    /**
     * @return the specie
     */
    public String getSpecie() {
        return specie;
    }

    /**
     * @param specie the specie to set
     */
    public void setSpecie(String specie) {
        this.specie = specie;
    }

    /**
     * @return the number
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * @return the day
     */
    public Integer getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(Integer day) {
        this.day = day;
    }
    
    
}
