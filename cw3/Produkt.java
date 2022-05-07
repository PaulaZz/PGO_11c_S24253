package cw3_PD;

import java.util.ArrayList;
import java.util.List;

public class Produkt {

    private String nazwa;
    private Kategoria kategoria;
    private double price;
    private int ilosc;
    private boolean czyDostepny;

    private List<Magazyn> storage = new ArrayList<>();

    public Produkt(String nazwa, Kategoria kategoria, double price, int ilosc, boolean czyDostepny) {
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.price = price;
        this.ilosc = ilosc;
        this.czyDostepny = czyDostepny;
    }


    public void sell() {
        this.ilosc--;
    }

    public void increaseQuantity(int ilosc) {
        this.ilosc += ilosc;
    }

    public List<Magazyn> getStorage() {
        return storage;
    }

    public void setStorage(List<Magazyn> storage) {
        this.storage = storage;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public boolean isCzyDostepny() {
        return czyDostepny;
    }

    public void setCzyDostepny(boolean czyDostepny) {
        this.czyDostepny = czyDostepny;
    }

    @Override
    public String toString() {
        return "Produkty{" +
                "nazwa='" + nazwa + '\'' +
                ", kategoria=" + kategoria +
                ", price=" + price +
                ", ilosc=" + ilosc +
                ", czyDostepny=" + czyDostepny +
                '}';
    }
}
