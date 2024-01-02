/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_05_linear_search;

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
        Random generator = new Random();
        int key = 6;
        int position = -1;
        for (int i = 0; i < 25; i++) {
            int number = generator.nextInt(6) + 1;
            System.out.println(number);
            if (position == -1 && number == key) {
                position = i;
            }
        }
        System.out.println("The position of the first 6 is : "+position);
    }
    
}
