/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_07_sum_magic;

import java.util.Random;

/**
 *
 * @author rajap
 */
public class Main {
    public static final int NUM_OF_NUMBERS = 10;
    public static final int LIMIT = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generator = new Random ();
        int sum = 0;
        for (int i=0; i<NUM_OF_NUMBERS; i++)
        {
            int number = generator.nextInt(LIMIT);
            System.out.println(number);
            sum += number;
        }
        System.out.println("the sum is:"+sum);
    }
    
}
