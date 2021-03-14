/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author Andres Ruiz
 */
public class BasicOperation {
    // adition, substraction, division, multiplication
    public static float addTwoNumbers(float operand1, float operand2){
        float result = 0;
        result = operand1 + operand2;
        return result;
    }
    public static float subtractTwoNumbers(float operand1, float operand2){
        float result = 0;
        result = operand1 - operand2;
        return result;
    }
    public static float multiplicateTwoNumbers(float operand1, float operand2){
        float result = 0;
        result = operand1 * operand2;
        return result;
    }
    public static float dividTwoNumbers(float operand1, float operand2){
        float result = 0;
        result = operand1 / operand2;
        return result;
    }
    
}
