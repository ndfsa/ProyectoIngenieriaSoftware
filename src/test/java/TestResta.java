import org.junit.Assert;
import org.junit.Test;

public class TestResta {


    @Test
    public void verificarNotas(){
        double expectedResult = 10;
        double actualResult = OperacionAritmetica.resta(30,20);
        Assert.assertEquals(expectedResult, actualResult,0.002);
    }

}
