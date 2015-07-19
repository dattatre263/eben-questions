package org.datta;

import java.util.Random;

/**
 * Created by dparupud on 7/19/15.
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
        String[] bag = (String[]) obj[i];

        System.out.println(bag[1]);


    }
}
