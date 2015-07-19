package org.datta;

/**
 * Created by dparupud on 7/19/15.
 * Answer to Question 5
 *
 * The fourth number is 9 as seen by the examples below.
 */
public class Question5 {

    public static void main(String[] args) {
        assert 10 ==  get4thNumber(5,9,4);
        assert 4 ==  get4thNumber(1,4,1);
        assert 9 == get4thNumber(6,5,2);
    }

    private static int get4thNumber(int first, int second, int third) {
        int temp = first - third;
        int fourth = second + temp;
        return fourth;
    }
}
