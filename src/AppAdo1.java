
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppAdo1 {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy");


        Date dataInicio = new Date();

        Date dataFim = formato.parse ("10/10/2026");


        System.out.println("Inicio: " + dataInicio);
        System.out.println("Inicio: " + dataFim);
    }
}
