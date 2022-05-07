package cw3_PD;

import java.util.ArrayList;
import java.util.List;

public class Zamowienie {

    private final int id;
    private double totalprice;

    private List<Produkt> listaProduktow = new ArrayList<>();

    public Zamowienie(int id) {
        this.id = id;
        this.totalprice = getTotalPrice();

    }

    // obliczenie wartości koszyka
    public double getTotalPrice() {
        double sum = 0;
        for(Produkt element : listaProduktow) {
            sum+=element.getPrice();
        }
        return sum;
    }

    public int getId() {
        return id;
    }


}
