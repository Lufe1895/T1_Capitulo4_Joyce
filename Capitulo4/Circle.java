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
public class Circle {
    private Double radius;
    private Double diameter;
    private Double area;
    
    public Circle(){
        this.radius=1.0;
        this.diameter=this.radius*2;
        this.area=Math.PI*Math.pow(this.radius, 2);
    }

    /**
     * @return the radius
     */
    public Double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(Double radius) {
        this.radius = radius;
        this.diameter=this.radius*2;
        this.area=Math.PI*Math.pow(this.radius, 2);
    }

    /**
     * @return the diameter
     */
    public Double getDiameter() {
        return diameter;
    }

    /**
     * @param diameter the diameter to set
     */
    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    /**
     * @return the area
     */
    public Double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(Double area) {
        this.area = area;
    }
    
    
}
