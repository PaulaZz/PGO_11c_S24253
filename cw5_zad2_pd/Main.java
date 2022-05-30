package pl.korki;

import pl.korki.eliksir.Eliksir;
import pl.korki.liquids.Alcohol;
import pl.korki.liquids.Liquid;
import pl.korki.liquids.Water;
import pl.korki.minerals.Crystal;
import pl.korki.minerals.Mineral;
import pl.korki.minerals.Ore;
import pl.korki.plants.Flower;
import pl.korki.plants.Plants;
import pl.korki.plants.Root;

public class Main {

    public static void main(String[] args) {
	// używamy wszędzie zmiennoprzecinkowych - double, ze względu na to, że są procenty
        // nasz basereagent szaleje i przyjmuje wartośc 100 na wejściu przy wielu metodach - do wyjasnienia

        Liquid liquidWat = new Liquid("Liquid Wodny", 10.0, 100.0);
        Water w1 = new Water(liquidWat, true);
        System.out.println("\n" + w1.getName());
        System.out.println(w1.getBaseReagent());
        System.out.println(w1.getDissolubility());
        System.out.println(w1);


        Liquid liquidAlco = new Liquid("Liquid Alkoholowy", 10.0, 100.0);
        Alcohol a1 = new Alcohol(liquidAlco, 10.0);
        System.out.println("\n" + a1.getName());
        System.out.println(a1.getBaseReagent());
        System.out.println(a1.getPercentage());
        System.out.println(a1.getDissolubility());
        System.out.println(a1);



        Mineral m1 = new Mineral("Mineral 1", 10.0, 100.0);
        Ore o1 = new Ore(m1, true);
        System.out.println(o1);

        Mineral m2 = new Mineral("Mineral 2", 10.0, 100.0);
        Crystal c1 = new Crystal(m2, 10.0);
        System.out.println(c1);

        Plants p1 = new Plants("Plant 1", 10.0, 1.0);
        Flower f1 = new Flower(p1);
        System.out.println(f1);

        Plants p2 = new Plants("Plant 2", 5.0, 4.0);
        Root r1 = new Root(p2);
        System.out.println(r1);

        Eliksir e1 = new Eliksir("Mikstura");
        e1.addIngredient(o1);
        e1.addIngredient(r1);
        e1.addIngredient(f1);
        e1.removeIngredient(r1);
        e1.setCatalyst(liquidAlco);
        e1.Create();
        System.out.println(e1);
    }
}
