package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // CREARE UNO SCANNER PER LEGGERE INPUT DA TERMINALE
        Scanner scan = new Scanner(System.in);

        // CHIEDERE ALL'UTENTE DI INSERIRE I VALORI DI BASE E ALTEZZA
        System.out.println("Inserisci il valore della base del rettangolo:");
        int newBaseValue = scan.nextInt();
        System.out.println("Inserisci il valore dell'altezza del rettangolo:");
        int newHeightValue = scan.nextInt();

        Rettangolo rettangolo = new Rettangolo();
        rettangolo.rettangoloAdd(newBaseValue, newHeightValue);

        // UTILIZZO DEI METODI PER CALCOLARE AREA E PERIMETRO
        int area = rettangolo.calculateArea();
        int perimetro = rettangolo.calculatePerimeter();

        // STAMPA DEI RISULTATI
        System.out.println("Area del rettangolo: " + area);
        System.out.println("Perimetro del rettangolo: " + perimetro);

        // DISEGNA IL RETTANGOLO IN CONSOLE
        rettangolo.disegna();

        scan.close();

    }
}
