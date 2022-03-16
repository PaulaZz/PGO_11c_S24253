public class zad6{
    public zad6(){

        int arr[] =new int[10];
        randomarr(arr);
        printarr(arr);
        sortarr(arr);
        printarr(arr);
    }
//wypisanie tablicy
    public static void printarr(int tab[]){
        System.out.print("tab[ ");
        for(int i = 0; i<tab.length; i++){
            if(i<tab.length-1){
                System.out.print(tab[i]+", ");
            }else{
                System.out.print(tab[i]);
            }

        }
        System.out.print(" ]");
        System.out.println("");
    }
//losowanie
    public static void randomarr(int tab[]){
        for(int i = 0; i<tab.length; i++){
            tab[i]=(int) (Math.random() * (1000 - 100)) + 100;
        }
    }

//sortowanie
    public static void sortarr(int tab[]){
        int temp;
        for (int i = 0; i < tab.length - 1; i++){
            for (int j = 0; j < tab.length - 1; j++){
                if(tab[j] > tab[j + 1]){
                    temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
    }

}
