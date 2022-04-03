package cw1;

import java.util.Scanner;

public class cw1_7 {
    public static void main(String[] args){

//pobieram od użytkownika liczbę i sprawdzam, do momentu aż jest podana liczba jest 5 i reszta z dzielenia nie jest 0
        while (true){
            System.out.println("Podaj liczbę większą od 4 i nieparzystą");
            Scanner scan = new Scanner(System.in);
            int n=scan.nextInt();

//sprawdzam czy liczba jest >= 5 i czy jest nieparzysta, czyli reszta z dzielenia != 0
            if (n<=4){
                System.out.println("Liczba jest błędna.");
            } else if(n>=5 && n%2!=0){
                // powtarzam rysowanie gwiazdek do rozmiaru n
                int gwiazdka=1;
                for (gwiazdka=1; gwiazdka<=n; gwiazdka++){
                    System.out.print("*");
                }
            //kończe warunek while nr 1
                break;
            }
        }



    }
}
