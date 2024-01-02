/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_06_select;

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
        for (int i = 0; i < 10; i++) {
            int number = generator.nextInt(6)+1;
            if(number %2 == 0)
            {
                System.out.println("*");
            }
            System.out.println(number);
        }
        
    }
    
}
