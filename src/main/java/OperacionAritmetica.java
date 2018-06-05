import java.math.BigDecimal;

public class OperacionAritmetica {
    /*
        metodo multiplicaion
        el siguiente metodo recibe 2 numeros double y devuelve un double
     */

    public static double multiplicaion(double x,double y) {
        BigDecimal bd1 = new BigDecimal(x);
        BigDecimal bd2 = new BigDecimal(y);
        return bd1.multiply(bd2).doubleValue();
    }
        public static double suma ( double a, double b){
            return a + b;
        }

        public static double resta ( double a, double b){
            double c = a - b;
            return c;
        }
    public static double div(double x, double y) {return x / y;}

//division

}
