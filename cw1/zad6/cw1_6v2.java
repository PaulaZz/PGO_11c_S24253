package cw1;

import java.util.Arrays;
import java.util.Random;

/* Zd6 - 4p:
        1p - tablica
        2p - implementacla metody sort
        1p - metoda drukowania tablicy
*/

public class cw1_6v2 {

    public static void main(String[] args) {
        int tablica[] = new int[10];

        druktab(tablica);
        sort(tablica);
    }


//metoda generowania tablicy, drukowania i losowanie
    static void druktab(int tab[]) {

        Random liczbalosowana = new Random();
        int x = 100;
        int y = 1000;

// pętla, w której losuję ilość liczb, jaką określa wielkość tablicy
        for (int c = 0; c < tab.length; c++) {
// miejsce, w którym chcę przypisać wylosowaną liczbe do komórki
// oraz określam wielkość zbioru, z którego losuję od większej odejmujemy mniejszą i dodajemy 1 - jest to liczność zbioru.
// Dodajemy następnie mniejszą bo to najmniejsza liczba w zakresie.
            tab[c] = liczbalosowana.nextInt(y - x + 1) + x;
            System.out.print(tab[c] + " ; ");
        }
}

//posiłkuję się sortowaniem z zadania 5
    public static int[] sort(int[] wartab)
        {
            return wartab;
        }
}

