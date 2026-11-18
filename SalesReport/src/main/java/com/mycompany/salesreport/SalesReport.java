/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class SalesReport {

public static void main(String[] args) {
    
//accept user data

Scanner input = new Scanner(System.in);

//Arrays to save user  data in array lists in 1D and 2d Arrays

String [] productsReport = {"Cozy Nights Monarch", "Restonic Barbados", "Safely Phuket"};   // products being sold for mattresses in 1D Array list
int [][] reportSales = new int [3][3]; // 2D Array list stores sales records

for (int x =0; x < productsReport.length; x++) { // loop to collect data for the mattress business
    
for (int r =0; r < 3; r++ ) { // to collect data for the individual mattress business

System.out.print("Enter number of sales for month" + (r + 1) + " for " + productsReport[x]);

reportSales[x][r] = input.nextInt();

}
    }

Product product = new productsReport(productsReport, reportSales);

PrintProduct sales = new PrintProduct();

//report system for displaying total rercord sales 

System.out.println("\n PRODUCT SALES REPORT - 2026 \n");
        
System.out.println("\n ******************************************************** \n");

report.PrintTotalSales(product.GetTotalSalesSold());
report.PrintAverageSales(product.GetAverageSalesSold());
report.PrintMostPopularProduct(product.GetMostPopularProduct());

input.close();

 }
}