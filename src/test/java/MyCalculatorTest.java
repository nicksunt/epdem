import org.junit.Assert;
import org.junit.Test;

public class MyCalculatorTest {
    MyCalculator myCalculator = new MyCalculator();

    @Test
    public void isSum1(){
        int x = 4;
        int y = 5;
        int z = x+y;
        System.out.println("test passed");
        Assert.assertEquals(z,myCalculator.sum(x,y));
    }

    @Test
    public void isSum2(){
        double x = 4;
        int y = 5;
        double z = x+y;
        Assert.assertEquals(z,myCalculator.sum(x,y), 0.00001);
    }
    @Test
    public void isSum3(){
        char x = 4;
        int y = 5;
        int z = x+y;
        Assert.assertEquals(z,myCalculator.sum(x,y), 0.00001);
    }
}
