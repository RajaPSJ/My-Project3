/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_04_minimum;

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
        int number  = generator.nextInt(100) + 1;
        int min = number;
        int minposition =0;
        System.out.println(number);
        for (int i = 1; i < 10; i++)
        {
            number = generator.nextInt(100) + 1;
            System.out.println(number);
            if (number<min)
            {
                min = number;
                minposition = i;
            }
        }
        System.out.println("The minimum number is : "+min+"and its position is : "+minposition);
    }
}
    

