package cw2;

// robię podobnie jak w zadaniu na ćwiczeniach dla Insurance.
// Nie mam pewności co do validation exception, ponieważ jak go użyłam i stworzyłam klasę,
//to dodało mi do opisu metody "throw validation exception" i nie wiedziałam czy to było ok?
// Dlatego użyłam runtime aby pominąć tę niepewność.

public class Adres {
    private String kraj;
    private String miasto;
    private String ulica;
    private int nrDomu;
    private int nrMieszkania;

    public Adres (String kraj, String miasto, String ulica, int nrDomu, int nrMieszkania){
        this.kraj=kraj;
        this.miasto=miasto;
        this.ulica=ulica;
        this.nrDomu=nrDomu;
        this.nrMieszkania=nrMieszkania;
    }

    public String getKraj(){
        return kraj;
    }

    public void setKraj(String kraj) {
        if (kraj==null || kraj.isEmpty()){
            throw new RuntimeException("Kraj jest wymagany. Uzupełnij.");
        }
        this.kraj = kraj;
    }


    public String getMiasto(){
        return miasto;
    }

    public void setMiasto(String miasto) {
        if (miasto==null || miasto.isEmpty()){
            throw new RuntimeException("Miasto jest wymagane. Uzupełnij.");
        }
        this.miasto = miasto;
    }


    public String getUlica(){
        return ulica;
    }

    public void getUlica(String ulica) {
        if (ulica==null || ulica.isEmpty()){
            throw new RuntimeException("Ulica jest wymagana. Uzupełnij.");
        }
        this.ulica = ulica;
    }

//runtime nie działa dla int
    public int getnrDomu(){
        return nrDomu;
    }

    public void setNrDomu(int nrDomu) {
        this.ulica = ulica;
    }


    public int getNrMieszkania(){
        return nrMieszkania;
    }

    public void setNrMieszkania(int nrMieszkania) {
        this.nrMieszkania = nrMieszkania;
    }


}
