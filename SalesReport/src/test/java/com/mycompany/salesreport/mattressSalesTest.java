/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.salesreport;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class mattressSalesTest {
    
    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {
        
    ProductCalculation calc = new ProductCalculations(4444);
    
    double result = calc.GetVat();
    
    assertEquals(424.0, result, 0.001);
    
        
    
    }
}
