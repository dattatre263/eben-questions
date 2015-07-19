/**
 * Created by dparupud on 7/19/15.
 */

package org.datta;

import org.junit.Assert;
import org.junit.Test;

public class Solutions {

    @Test
    public void testComplementOfIntersection(){
        boolean a = true;
        boolean b = false;
        boolean c = !(a & b);
        boolean d = !a | !b;
        Assert.assertEquals(c,d);
    }

    @Test
    public void testComplementOfUnion(){
        boolean a = true;
        boolean b = false;
        boolean c = !(a & b);
        boolean d = !a | !b;
        Assert.assertEquals(c,d);
    }



}
