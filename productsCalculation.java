/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productapp;

/**
 *
 * @author Student
 */
public class productsCalculation implements IProductCalculations {
    
double price;
this.price = price();
    
    }
    
    @Override
    
    public double GetVat() {
        
    return price * 0,15;
    
    }
    
    @Override
    
    public double GetComission() {
        
    return price * 0,5;
            
    }
    
    @Override
    
    public double GetTotal() {
        
    return price + GetVat() + GetComission();
    
    }
    
}
