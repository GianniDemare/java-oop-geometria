package org.lessons.java.geometria;

public class Rettangolo {
    // ATTRIBUTI
    int base;
    int height;

    // COSTRUTTORI
    Rettangolo() {
        base = 20;
        height = 10;
    }


    // METODI
    void rettangoloAdd(int baseAdd, int heightAdd){
        base = baseAdd;
        height = heightAdd;
    }

    // METODO PER CALCOLARE L'AREA DEL RETTANGOLO
    public int calculateArea() {
        return base * height;
    }

    // METODO PER CALCOLARE IL PERIMETRO DEL RETTANGOLO
    public int calculatePerimeter() {
        return 2 * (base + height);
    }

    // METODO PER DISEGNARE IL RETTANGOLO IN CONSOLE
    public void disegna() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == base - 1) {
                    // STAMPA IL BORDO DEL RETTANGOLO
                    System.out.print("0");
                } else {
                    // STAMPA GLI SPAZI ALL'INTERNO DEL RETTANGOLO
                    System.out.print(" ");
                }
            }
            // VAI A CAPO ALLA FINE DI OGNI RIGA
            System.out.println();
        }
    }


}


