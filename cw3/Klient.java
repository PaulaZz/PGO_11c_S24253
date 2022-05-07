package cw3_PD;

public class Klient {

    private String imie;
    private String nazwisko;
    private double ileGotowki;
    private double ileNaKarcie;

    public Klient(String imie, String nazwisko, double ileGotowki, double ileNaKarcie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.ileGotowki = ileGotowki;
        this.ileNaKarcie = ileNaKarcie;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if (imie == null || imie.isEmpty()){
            throw new RuntimeException("Imie nie może być puste");
        }
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if (nazwisko == null || nazwisko.isEmpty()){
            throw new RuntimeException("Nazwisko nie może być puste");
        }
        this.nazwisko = nazwisko;
    }

    public double getIleGotowki() {
        return ileGotowki;
    }

    public void setIleGotowki(double ileGotowki) {
        this.ileGotowki = ileGotowki;
    }

    public double getIleNaKarcie() {
        return ileNaKarcie;
    }

    public void setIleNaKarcie(double ileNaKarcie) {
        this.ileNaKarcie = ileNaKarcie;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", ileGotowki=" + ileGotowki +
                ", ileNaKarcie=" + ileNaKarcie +
                '}';
    }
}
