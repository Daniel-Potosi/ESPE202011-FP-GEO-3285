/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpo2_controlstatement;

import java.util.Scanner;

/**
 *
 * @author Andres Ruiz
 */
public class FPO2_controlStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter an integer --");
        
          int sum;
  sum = 0 ;
  
  for (int n = 1 ; n <= 2 ; n+=1){
  	  sum = sum + n;
  }
  System.out.println("The sum of the first 35 Even numbers is \n-->" + sum);
 }
    }
    
