package Funzionalita;

public class Chiamata {
    private int numeroChiamato;
    private int durata;

    public Chiamata(int numChiamato, int durata) {
        this.numeroChiamato = numChiamato;
        this.durata = durata;
    }

    public int getNumeroChiamato() {
        return this.numeroChiamato;
    }

    public int getDurata() {
        return this.durata;
    }

}
