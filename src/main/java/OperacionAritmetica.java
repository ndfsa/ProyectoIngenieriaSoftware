import java.math.BigDecimal;

public class OperacionAritmetica {
    public static void main(String[]args){
        System.out.println(multiplicaion(Double.MAX_VALUE,2));
    }

    /*
        metodo multiplicaion
        el siguiente metodo recibe 2 numeros double y devuelve un double
     */

    public static double multiplicaion(double x,double y){
        BigDecimal bd1 = new BigDecimal(x);
        BigDecimal bd2 = new BigDecimal(y);
        return bd1.multiply(bd2).doubleValue();
    }
    public static double suma(double a, double b) { return a + b; }
}
