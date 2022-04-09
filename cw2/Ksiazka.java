package cw2;

import java.time.LocalDate;
import java.util.UUID;

public class Ksiazka {

    //w zadaniu był LONG dla ID, ale znalazłam opcje UUID losującą ID, dlatego jej używam
    private UUID id;
    private String nazwa;
    private Gatunek gatunek;
    private Jezyk jezyk;
    private LocalDate dataWydania;
    private int licznik;
    //zakladam, że książka jest dostępna
    private boolean dostepnosc = true;


    public Ksiazka(String nazwa, Gatunek gatunek, Jezyk jezyk, LocalDate dataWydania) {
        this.nazwa = nazwa;
        this.gatunek = gatunek;
        this.jezyk = jezyk;
        this.dataWydania = dataWydania;
        this.licznik = licznik;

    }


    // odnosnie używania unikalnego ID, zaczęrpnęłam wiedzę stąd i dopowiedział inteli: https://doraprojects.net/questions/1389736/how-do-i-create-a-unique-id-in-java
    //najpierw ustawiam losując id a potem je "pobieram" dalej
    public UUID setId() {
        return UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        if (nazwa == null || nazwa.isEmpty()) {
            throw new RuntimeException("Podaj nazwę książki. ");
        }
        this.nazwa = nazwa;
    }


    public Gatunek getGatunek() {
        return gatunek;
    }
    // nie sprawdzam warunku tutaj czy jest pusty Gatunek, musi mieć wartości w sobie
    public void setGatunek(Gatunek gatunek) {
        if (gatunek == null) {
            throw new RuntimeException("Podaj nazwę gatunku. ");
        }
        this.gatunek = gatunek;
    }


    public Jezyk getJezyk() {
        return jezyk;
    }
    public void setJezyk(Jezyk jezyk){
        if(jezyk==null){
            throw new RuntimeException("Podaj język. ");
        }
        this.jezyk=jezyk;
    }

    public LocalDate getDataWydania(){
        return dataWydania;
    }
    public void setDataWydania(LocalDate dataWydania){
        this.dataWydania=dataWydania;
    }


    public int getLicznik(){
        return licznik;
    }
    public void setLicznik(int licznik){
        this.licznik=licznik;
        licznik++; // zwiększam o jeden licznik bo tak jest w zadaniu
    }

    public boolean getisDostepnosc(boolean isDostepnosc){
        return isDostepnosc;
    }



}