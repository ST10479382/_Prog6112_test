/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consolessalesreport;

/**
 *
 * @author Student
 */
public class ConsolesSalesReport {

    
public class ConsoleSalesReport {
public static void main(String[] args) {
Scanner input = new Scanner("System.in");

// Display menu
System.out.println("Select the package type");
System.out.println("1) PS5");
System.out.println("2) XBOX");
System.out.println("3) SWITCH");

// Read choice
   int choice = input.nextInt();
input.nextLine(); 
//consoles types
String consoleType;
switch (choice) {
case 1:
consoleType = "PS5";
break;
case 2:
consoleType = "XBOX";
break;
case 3:
consoleType = "SWITCH";
break;
default:
consoleType = "Unknown";
System.out.println("Invalid selection.");
return;
}

// Get store name
System.out.print("Enter the store: ");
String store = input.nextLine();

// Get total sales
System.out.print("Enter the total sales of " + consoleType +
" consoles for " + store + ":");
int totalSales = input.nextInt();

// Print the report
System.out.println();
System.out.println("CONSOLE SALES REPORT");
System.out.println("************************");
System.out.println("CONSOLE TYPE: " + consoleType);
System.out.println("STORE: " + store);
System.out.println("TOTAL SALES: " + totalSales);

input.close();
}

}
}
