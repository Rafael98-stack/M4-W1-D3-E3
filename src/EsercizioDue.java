import Funzionalita.SIM;

import java.util.Arrays;

public class EsercizioDue {
    public static void main(String[] args) {

        SIM Gianni = new SIM(324568435,0, new int[]{321312312,1111,2222});
        System.out.println("La tua SIM: "+Arrays.toString(Gianni.getChiamate()));
        System.out.println("Il tuo Numero: "+Gianni.getNumero());
        System.out.println("Il tuo Credito: "+ Gianni.getCredito());
    }
}
