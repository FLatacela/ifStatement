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
public class CharacterPractice {
    public static void main(String[] args){
        //Get a character from the user
        Scanner scans = new Scanner(System.in);
        System.out.print("please enter a character: ");
        
       char aCharacterVariable=scans.next().charAt(0);
       
       System.out.println("You entered: " +aCharacterVariable );
       
     if (aCharacterVariable > 'z' )
           
           System.out.println(aCharacterVariable + " is grater than z.");
        
    }
    
}

   
