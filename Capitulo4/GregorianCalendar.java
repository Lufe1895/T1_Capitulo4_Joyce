/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4;

import java.util.ArrayList;

/**
 *
 * @author luisl
 */
public class GregorianCalendar {
    private Month nMonth;
    private Nodo inicio;
    
    public GregorianCalendar(){
        this.inicio=null;
        nMonth=new Month();
        addDays();
    }
    
    private void addDays(){
        this.add("December",getnMonth().getDecember());
        this.add("November",getnMonth().getNovember());
        this.add("October",getnMonth().getOctober());
        this.add("September",getnMonth().getSeptember());
        this.add("August",getnMonth().getAugust());
        this.add("July",getnMonth().getJuly());
        this.add("June",getnMonth().getJune());
        this.add("May",getnMonth().getMay());
        this.add("April",getnMonth().getApril());
        this.add("March",getnMonth().getMarch());
        this.add("February",getnMonth().getFebruary());
        this.add("January",getnMonth().getJanuary());
    }
    
    private void add(String name,int month){
        Nodo nuevo = new Nodo(name,month);
        
        if(this.getInicio()==null){
            inicio=nuevo;
        }else{
            nuevo.setSiguiente(getInicio());
            inicio=nuevo;
        }
    }
    
    public int search(String name,int number){
        Nodo aux=inicio;
        int reminder;
        while((aux!=null) && (!aux.getName().equals(name))){
            aux=aux.getSiguiente();
        }
        reminder = aux != null ? aux.getDays()-number:0;
        return reminder;
        
    }
    
    public Nodo date(String name){
        Nodo aux=inicio;
        while((aux!=null) && (!aux.getName().equals(name))){
            aux=aux.getSiguiente();
        }
        return aux;
        
    }
    
    public int yearEnd(String name,int number){
        Nodo aux=inicio;
        int reminder=0;
        while((aux!=null) && (!aux.getName().equals(name))){
            aux=aux.getSiguiente();
        }
        reminder+=aux.getDays()-number;
        aux=aux.getSiguiente();
        while(aux!=null){
            reminder+=aux.getDays();
            aux=aux.getSiguiente();
            
        }
        
        return reminder;
    }

    /**
     * @return the nMonth
     */
    public Month getnMonth() {
        return nMonth;
    }

    /**
     * @return the inicio
     */
    public Nodo getInicio() {
        return inicio;
    }
    
    
    
    
}
