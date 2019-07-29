/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.windowreplacer;

import java.util.Scanner;


/**
 *
 * @author svlln
 * 
 * The purpose of the program is to calculate the total cost for home replacement windows. Here are the requirements:
 * It must prompt the user for the height of the window (in feet).
 * It must prompt the user for the width of the window (in feet).
 * It must calculate and display the area of the window.
 * It must calculate and display the perimeter of the window.
 * Based on the area and perimeter, it must calculate the total cost of the window.
 * The glass for the windows cost $3.50 per square foot.
 * The trim for the windows cost $2.25 per linear foot.
 */


public class io {
    
    public static void main (String[] args){
        
        //declare variables for height and width
        float height;
        float width;
        // declare String variables to hold the users height and width inputs
        String stringHeight;
        String stringWidth;
        
        //declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        float glassCostPerSquareFoot = 3.50f;
        float trimOfWindowCost = 2.25f;
        
        // Declare initial scanner
        Scanner myScanner = new Scanner(System.in);
        
        // get input for users
        System.out.println("Please enter window height: ");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width: ");
        stringWidth = myScanner.nextLine();
        
        // convert strings to values
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        // calculate the area of the window 
        areaOfWindow = height * width;
        // calculate the perimiter of the window
        perimeterOfWindow = 2 * (height + width);
        
        // calculate the total cost
        cost = ((glassCostPerSquareFoot * areaOfWindow) + (trimOfWindowCost * perimeterOfWindow));
        
        
        System.out.println("Window Height: " + stringHeight);
        System.out.println("Window width: " + stringWidth);
        System.out.println("Window area: " + areaOfWindow);
        System.out.println("Window perimeter: " + perimeterOfWindow);
        System.out.println("Total cost: " + cost);
        
        
    }
    
    
}
