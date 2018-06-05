import org.junit.Assert;
import org.junit.Test;

public class TestMain {



    @Test
    public void verificarResultado(){
        double expectedResult = 30.0/40.0;



        double actualResult = OperacionAritmetica.div(30,40);


        Assert.assertEquals(expectedResult, actualResult,0.002);



    }
//    @Test
//    public void verifcarResultadoIncorrecto(){
//        double expectedResultIncorrect = -10.0/-50.0+2;
//
//
//
//        double actualResultIncorrect = OperacionAritmetica.div(-10,-50);
//
//        Assert.assertEquals(expectedResultIncorrect, actualResultIncorrect,0.002);
//    }


}
