package tut4_dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 */
public class TestCalc
{@Test
public void testsay(){
    Calc d = new Calc();
    int ret = d.add(1,2);
    Assertions.assertEquals(3,ret);
}@Test
public void testsay2(){
    Calc t = new Calc();
    int res = t.subtract(1,2);
    Assertions.assertEquals(-1,res);
}
}
