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
public class Patient {
    
    private Integer id;
    private Integer age;
    private BloodData bd;
    
    public Patient(){
        this.id=0;
        this.age=0;
        this.bd= new BloodData();
    }
    
    public Patient(int id,int age,BloodType bloodType,Factor factor){
        this.id=id;
        this.age=age;
        this.bd= new BloodData(bloodType,factor);
    }
    
    public static void main(String[] args) {
        Patient p = new Patient();
        Patient p2 = new Patient(724,37,BloodType.A,Factor.POSITIVO);
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the bd
     */
    public BloodData getBd() {
        return bd;
    }

    /**
     * @param bd the bd to set
     */
    public void setBd(BloodData bd) {
        this.bd = bd;
    }
}
