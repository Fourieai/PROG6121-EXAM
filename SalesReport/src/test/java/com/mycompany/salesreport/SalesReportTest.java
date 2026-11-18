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
public class SalesReportTest {
    
    public SalesReportTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class SalesReport.
     */
    @Test
    public void ProductTest() {
       
        
    // data input example
    
    String [] productsReport = {"Cozy Nights Monarch", "Restonic Barbados", "Safely Phuket"};
    int [][] reportSales = {{"30", "44", "33"}, {"12", "25", "11"}, {"33", "44", "85"}};
    
    }
        
    
    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        
    report.PrintTotalSales(product.GetTotalSalesSold()); // to correctlyy return the total products sold
    
    }
    
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        
    report.PrintAverageSales(product.GetAverageSalesSold()); // to correctlyy return the total products sold
    
    }
    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SalesReport.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
