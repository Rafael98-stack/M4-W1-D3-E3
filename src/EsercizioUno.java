//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Funzionalita.Rettangoli;

public class EsercizioUno {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        Rettangoli rettangolo1 = new Rettangoli(20,50);
        Rettangoli rettangolo2 = new Rettangoli(40,50);
        Rettangoli rettangolo3 = new Rettangoli(10,50);

 int area = rettangolo2.getArea()+rettangolo3.getArea();
        int perimetro = rettangolo2.getPerimetro()+rettangolo3.getPerimetro();
        System.out.println("Altezza e Larghezza Primo Rettangolo: "+rettangolo1.getArea()+" di Altezza e "+rettangolo1.getPerimetro()+" di Larghezza" );
        System.out.println("Area e perimetro del rettangolo 2 e 3 "+area+" "+perimetro);

    }

}