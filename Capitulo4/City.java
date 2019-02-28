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
public class City {
    private String name;
    private Integer population;
    
    public City(){
        this.name="";
        this.population = 0;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the population
     */
    public Integer getPopulation() {
        return population;
    }

    /**
     * @param population the population to set
     */
    public void setPopulation(Integer population) {
        this.population = population;
    }

    
    
}
