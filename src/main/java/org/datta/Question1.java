package org.datta;

/**
 * Created by dparupud on 7/19/15.
 *
 * Answer to Question1
 *
 * Yes it is a true statement. See the assertions below
 */
public class Question1 {

    public static void main(String[] args) {
        check(true,true);
        check(true,false);
        check(false,true);
        check(false,false);

    }

    static void check(boolean a, boolean b){
        boolean c = !(a & b);
        boolean d = !a | !b;
        assert c == d;
    }
}
