package cw6_pd;

public class SquareFunction extends Function implements Fun{
    private double a; // współczynnik szerokości i kierunku paraboli
    private double b; // współczynnik przesunięcia osi symetrii
    private double c; // współczynnik przecięcia y paraboli

    public SquareFunction(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double f(double x) {
        return a*(x*x)+b*x+c;
    }

    @Override
    public void increaseCoefficientsBy(double delta){
        this.a += delta;
        this.b += delta;
        this.c += delta;
    }

    @Override
    public void decreaseCoefficientsBy(double delta){
        this.a -= delta;
        this.b -= delta;
        this.c -= delta;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
