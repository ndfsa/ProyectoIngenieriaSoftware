import org.junit.Assert;
import org.junit.Test;

public class TestSuma {
    @Test
    public void verificarSuma(){
        double expectedResult = 5;
        double actualResult = OperacionAritmetica.suma(2.5,2.5);

        Assert.assertEquals(expectedResult, actualResult, 0.002);
    }
}
