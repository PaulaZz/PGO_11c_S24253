package cw3_PD;

public class Magazyn {

    private int czasDostawy;
    private Produkt produkt;


    public Magazyn(int czasDostawy, Produkt produkt) {
        this.czasDostawy = czasDostawy;
        this.produkt = produkt;

        produkt.getStorage().add(this);
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt produkt) {
        if(produkt == null ){
            throw  new RuntimeException("Produkt nie może być pusty.");
        }
        this.produkt = produkt;
    }

    public int getCzasDostawy() {
        return czasDostawy;
    }

    public void setCzasDostawy(int czasDostawy) {
        if(czasDostawy < 0){
            throw  new RuntimeException("Czas dostawy nie może być mniejszy od 0.");
        }
        this.czasDostawy = czasDostawy;
    }

    @Override
    public String toString() {
        return "Czas dostawy: " + czasDostawy + " produktu: " + produkt;
    }


}
