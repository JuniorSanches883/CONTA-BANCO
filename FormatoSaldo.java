package conta_banco;

import java.text.NumberFormat;
import java.text.DecimalFormat;
public class FormatoSaldo {

static NumberFormat formatoValores = new DecimalFormat ("R$ #,##0,00");
    public static String doubleString (Double valor){
    return formatoValores.format (valor);
    }
}

