/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_01_sum;

import java.util.Random;

/**
 *
 * @author rajap
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generator = new Random ();
        int sum = 0;
        for (int i=0; i<10; i++)
        {
            int number = generator.nextInt(10);
            System.out.println(number);
            sum += number;
        }
        System.out.println("the sum is:"+sum);
    }
    
}
