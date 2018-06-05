import org.junit.Assert;
import org.junit.Test;


public class TestMulti {

    @Test
    public void MultiplicacionSimple(){
        double expectedResult= 10000;
        double actualResult = OperacionAritmetica.multiplicaion(100,100);
        Assert.assertEquals(expectedResult,actualResult,0.0005);
    }





}
