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
public class FormLetterWriter {
    
    private String fName;
    private String lName;
    
    public FormLetterWriter(){
        this.lName="";
        this.fName="";
    }
    
    public FormLetterWriter(String lName){
        this.lName=lName;
        this.fName="";
    }
    
    public FormLetterWriter(String fName,String lName){
        this.lName=lName;
        this.fName=fName;
    }
    
    public String displaySalutation(){
        return String.format("Dear Mr. or Ms. %s. Thank you for your recent order.",this.lName);
    }
    
    public String displaySalutation1(){
        return String.format("Dear %s %s. Thank you for your recent order.",this.fName,this.lName);
    }

    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
    }
    
    
    
}
