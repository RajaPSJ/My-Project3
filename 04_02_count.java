/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_02_count;

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
        int count = 0;
        int i;
        for (i = 0; i < 10; i++) {
            int number = generator.nextInt(6)+1;
            System.out.println(number);
            if (number == 5 || number == 6)
            {
                count++;
            }
        }
        System.out.println("The number of 5s and 6s is :"+count);
    }
    
}
