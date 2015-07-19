package org.datta;

import java.util.Random;

/**
 * Answer to Question 4
 *
 * The probability of getting a bag that has both white marbles is 1/3.
 *
 */
public class Question4 {

    public static void main(String[] args) {
        String WHITE = "white";
        String BLACK = "BLACK";

        String[] bag1 = {WHITE,WHITE};
        String[] bag2 = {BLACK,BLACK};
        String[] bag3 = {WHITE,BLACK};

        Object[] obj = {bag1,bag2,bag3};
        Random random = new Random();

        // The probability of one picking bag1 is 1/3
        int i = random.nextInt(3);
        if( i == 0){
            String[] bag = (String[]) obj[i];
            System.out.println(bag[1]);
        }

    }
}
