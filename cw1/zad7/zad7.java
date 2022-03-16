import java.util.Scanner;

public class zad7 {

    public zad7(){

    boolean correctnumber = false;
    int a;

    System.out.println("Podaj liczbe, która jest nieparzysta i większa od 5: ");

    do{

        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        System.out.println("Liczba jest błędna. Spróbuj ponownie");

        if((a > 5) && (a %2!=0)){
            correctnumber = true;
        }else{
            correctnumber = false;
        }
    }
    while(correctnumber == false);

    drawbox(a);
}

    static void drawbox(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print(" * ");
        }
        System.out.println();
        for (int i = 0; i < x - 2; i++) {
            System.out.print(" * ");
            for (int j = 0; j < x - 2; j++) {
                if(i==j){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println(" * ");
        }
        for (int i = 0; i < x; i++) {
            System.out.print(" * ");
        }
        System.out.println();
    }
}
