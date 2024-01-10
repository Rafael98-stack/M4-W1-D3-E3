import Funzionalita.Chiamata;
import Funzionalita.SIM;

public class EsercizioDue {
    public static void main(String[] args) {
int numeroChiamate = 5;
        SIM Gianni = new SIM(324568435);


        Chiamata[] ListaChiamate = new Chiamata[numeroChiamate];
        ListaChiamate[0] = new Chiamata(432423424, 10);
        ListaChiamate[1] = new Chiamata(645674545, 11);
        ListaChiamate[2] = new Chiamata(231312312, 8);
        ListaChiamate[3] = new Chiamata(876867867, 20);
        ListaChiamate[4] = new Chiamata(534243243, 3);

        Chiamata[]arr = new Chiamata[1];
        arr[0]= new Chiamata(321312321,1);

        Gianni.setListaChiamate(ListaChiamate);
        Gianni.aggiungiCredito(10.10);
        Gianni.Dati();
    }
}
