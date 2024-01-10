package Funzionalita;


public class SIM {
    private int numero;
    private int credito;
    private int[]chiamate ;

    public SIM(int numero, int credito,int[] chiamate) {
        this.numero= numero;
        this.credito= credito;
        this.chiamate = chiamate;
    };

    public int getNumero() {
        return numero;
    }
public int[] getChiamate() {
        return  chiamate;
}
    public int getCredito() {
        return credito ;
    }
}
