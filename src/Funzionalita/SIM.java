package Funzionalita;

public class SIM {
    private int numero;
    private double credito;
    private Chiamata[]chiamate ;

    public SIM(int numero) {
        this.numero= numero;
        this.credito= 0;
        this.chiamate = new Chiamata[5];
    };
public void aggiungiCredito(double nuovoCredito) {this.credito+=nuovoCredito;};
    public void setListaChiamate(Chiamata[] listaChiamate) {
        this.chiamate = listaChiamate;
    }
    public void Dati1Chiamata() {
        System.out.println("La Chiamata 1 "+ );
    }
   public void Dati() {
       System.out.println("Sim: " + this.numero);
       System.out.println("Credito attuale: " + this.credito);
//		System.out.println("Lista chiamate Sim: " + Arrays.toString(chiamate));
       if (chiamate[0] != null) {
           System.out.println("- Chiamata 1: " + chiamate[0].getNumeroChiamato() + " - Durata minuti: "
                   + chiamate[0].getDurata());
       }
       if (chiamate[1] != null) {
           System.out.println("- Chiamata 2: " + chiamate[1].getNumeroChiamato() + " - Durata minuti: "
                   + chiamate[1].getDurata());
       }
       if (chiamate[2] != null) {
           System.out.println("- Chiamata 3: " + chiamate[2].getNumeroChiamato() + " - Durata minuti: "
                   + chiamate[2].getDurata());
       }
       if (chiamate[3] != null) {
           System.out.println("- Chiamata 4: " + chiamate[3].getNumeroChiamato() + " - Durata minuti: "
                   + chiamate[3].getDurata());
       }
       if (chiamate[4] != null) {
           System.out.println("- Chiamata 5: " + chiamate[4].getNumeroChiamato() + " - Durata minuti: "
                   + chiamate[4].getDurata());
       }
   }
}
