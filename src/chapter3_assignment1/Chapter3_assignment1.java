/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter3_assignment1;

import java.util.Scanner;

/**
 *
 * @author class
 */
public class Chapter3_assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO: Get Y from the user
        System.out.print("Please enter a number:  ");
        
        int y;
        
       Scanner input;
        input= new Scanner(System.in);
        y= input.nextInt();
        
        int x = 5;
        
        
        //TODO: Set x to 0 when y is 20
        if (y==20){
        x=0;
        }
    //TODO: Output both x and y.
       System.out.println("x is " +x+ " and y is " + y);
        
    }
    
    
    
}
