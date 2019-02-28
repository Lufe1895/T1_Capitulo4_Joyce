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
public class Billing {
    private static Double TAX=1.8;
    
    private Double price;
    
    public Billing(){
        this.price=0.0;
    }
    
    public Double computeBill(){
        return this.price*TAX;
    }
    
    public Double computeBill(int quantity){
        return this.price*quantity*TAX;
    }
    
    public Double computeBill(int quantity,double coupon){
        double discount = (100 - coupon)/100;
        
        return this.price*quantity*discount*TAX;
    }

    /**
     * @return the TAX
     */
    public static Double getTAX() {
        return TAX;
    }

    /**
     * @param aTAX the TAX to set
     */
    public static void setTAX(Double aTAX) {
        TAX = aTAX;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }
    
    
}
