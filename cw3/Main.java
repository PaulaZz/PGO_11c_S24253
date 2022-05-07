package cw3_PD;
// mieszałam nazewnictwo w zakresie całego zadania- raz po polsku, a raz po angielsku, ale da się w tym odnaleźć


public class Main {
    public static void main(String[] args) {

        Klient k1 = new Klient("Kasia", "Kowalska", 2258.80 , 0.0);
        Klient k2 = new Klient("Bartek", "Jankowski", 0.0 , 4690.0);

        // deklaracja produktów
        Produkt p1 = new Produkt("Mleko", Kategoria.Spozywcze, 50.00, 10, true);
        Produkt p2 = new Produkt("Telewizor" , Kategoria.Elektronika, 1200.00, 2, true);

        // zwiekszenie ilosci
        p1.increaseQuantity(10);
        System.out.println("Ilość produktu: ");
        System.out.println(p1.getIlosc());

        p2.increaseQuantity(4);
        System.out.println("Ilosć produktu: ");
        System.out.println(p2.getIlosc());


        //czas dostawy z zadeklarowanego 1 magazynu
        Magazyn m1 = new Magazyn(500, p1);
        System.out.println(m1);

        // czas dostawy z zadeklarowanego 2 magazynu
        Magazyn m2 =new Magazyn(200, p2);
        System.out.println(m2);

        // sprzedaż produktu z tego magazynu
        p1.sell();
        System.out.println("Pozostało w magazynie: "+ p1.getIlosc());

        p2.sell();
        System.out.println("Pozostało w magazynie: " +p2.getIlosc());


    }
}
