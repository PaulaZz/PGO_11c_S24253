package cw4_zad2_pd;

import java.awt.geom.Area;


// zrobiłam to co wiedziałam i potrafiłam, choć wiem, że jest tego niewiele..

public class Matrix extends Area {

    private int[][] tab;
    private int row;
    private int column;

    private Matrix(int row, int column){
       this.row = row;
       this.column = column;
       this.tab = new int[row][column];
    }
// Inteli podpowiadał aby bylo static
    public static void setUpMatrix(int rowCount, int columnCount) {

    }

//Inteli podpowiadał aby było static
    static void insertRow(int[] row) {

    }


    static Matrix create() {

    }

    public static Area add(Matrix matrixA, Matrix matrixB) {

    }

    //wypisuję tablicę - akurat wypisywanie tablic dwuwymiarowych umiem bez sprawdzania w main:))
    void print() {
        for (int w=0; w< tab.length; w++){
            // zaczynając iśc po wierszach wypisuję najpierw '|'
        System.out.println("|  ");
        for (int k=0; k< tab[w].length; k++){
            var newtab = tab[w][k];
            System.out.print(newtab);
        }
            // jak jest koniec wiersza to zamykam '|'
            System.out.println("  |");
        }
    }


    public Object subtract(Matrix matrixC) {

    }


    public Matrix add(Matrix matrixB) {

    }
}
