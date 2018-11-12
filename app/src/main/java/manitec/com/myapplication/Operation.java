package manitec.com.myapplication;

/**
 * Created by mani on 7/10/18.
 */

public class Operation {
    public String suma(String numero1, String numero2){
        int resultado = Integer.valueOf(numero1) + Integer.valueOf(numero2);
        return String.valueOf(resultado);
    }

    public String resta(String numero1, String numero2){
        int resultado = Integer.valueOf(numero1) - Integer.valueOf(numero2);
        return String.valueOf(resultado);
    }

    public String prodcut(String numero1, String numero2){
        int resultado = Integer.valueOf(numero1) * Integer.valueOf(numero2);
        return String.valueOf(resultado);
    }
}
