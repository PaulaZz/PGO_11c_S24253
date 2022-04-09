package cw2;

import exception.ValidationException;

import java.time.LocalDate;
import java.time.Period;

public class Czlowiek{

    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzin;
    private Period wiek;
    private Adres adres;

    public Czlowiek (String imie, String nazwisko, LocalDate dataUrodzin, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        wiek=getWiek();
    }


    public String getImie(){
        return imie;
    }
    public void setImie(String imie){
        if (imie==null||imie.isEmpty()){
            throw new RuntimeException("Imie jest wymagane. Uzupełnij.");
        }
        this.imie=imie;
    }


    public String getNazwisko(){
        return nazwisko;
    }
    public void setNazwisko(String nazwisko){
        if (nazwisko==null||imie.isEmpty()){
            throw new RuntimeException("Nazwisko jest wymagane. Uzupełnij.");
        }
        this.nazwisko=nazwisko;
    }


    public LocalDate getDataUrodzin(){
        return dataUrodzin;
    }
    public void setDataUrodzin(LocalDate dataUrodzin){
        this.dataUrodzin=dataUrodzin;
    }


    // pobieram tylko wiek, ale nie muszę go przechowywać. Ustalam wiek od podanej daty urodzin do daty dzisiejszej
    public Period getWiek() {
        return Period.between(dataUrodzin, LocalDate.now());
    }


    public Adres getAdres(){
        return adres;
    }
    public void setAdres(Adres adres){
        this.adres=adres;
    }

}
