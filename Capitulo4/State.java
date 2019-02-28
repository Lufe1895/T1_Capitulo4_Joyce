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
public class State {
    private String nState;
    private Integer population;
    private City mPCity;
    private City cCity;
    
    public State(String nState,
            int population,
            String cName,
            int cPopulation,
            String mName,
            int mPopulation){
        
        this.nState=nState;
        this.population=population;
        cCity=new City();
        cCity.setName(cName);
        cCity.setPopulation(cPopulation);
        mPCity=new City();
        mPCity.setName(mName);
        mPCity.setPopulation(mPopulation);
    }

    /**
     * @return the nState
     */
    public String getnState() {
        return nState;
    }

    /**
     * @param nState the nState to set
     */
    public void setnState(String nState) {
        this.nState = nState;
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

    /**
     * @return the mPCity
     */
    public City getmPCity() {
        return mPCity;
    }

    /**
     * @param mPCity the mPCity to set
     */
    public void setmPCity(City mPCity) {
        this.mPCity = mPCity;
    }

    /**
     * @return the cCity
     */
    public City getcCity() {
        return cCity;
    }

    /**
     * @param cCity the cCity to set
     */
    public void setcCity(City cCity) {
        this.cCity = cCity;
    }
    
}
