package Funzionalita;

public class Rettangoli {
    private int altezza;
    private int larghezza;

    public Rettangoli(int altezza, int larghezza) {
this.altezza=altezza;
this.larghezza=larghezza;
    }
    public int getAltezza() {
        return altezza;
    }
    public int getLarghezza() {
        return larghezza;
    }

    public int getArea() {
        return altezza * larghezza ;
    }
    public int getPerimetro() {
        return (altezza * 2) + (larghezza * 2);
    }
}
