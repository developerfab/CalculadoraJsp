/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author fabricio
 */
public class Operaciones {
    
    //ATRIBUTOS
    private int value1;
    private int value2;
    
    //CONSTRUCTOR
    
    public Operaciones(){
        
    }
    
    //METODOS

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }
    
    public int suma(){
        return this.value1 + this.value2;
    }
    
}
