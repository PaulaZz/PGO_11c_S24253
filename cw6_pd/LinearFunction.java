package cw6_pd;

public class LinearFunction extends Function implements Fun{
    private double a; // nachylenie funkcji liniowej
    private double b; // przecięcie y funkcji liniowej

    public LinearFunction(double a, double b) {
        this.a = a;
        this.b = b;
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

    @Override
    public void increaseCoefficientsBy(double delta){
        this.a += delta;
        this.b += delta;
    }

    @Override
    public void decreaseCoefficientsBy(double delta){
        this.a -= delta;
        this.b -= delta;
    }

    @Override
    public double f(double x){
        return a*x+b;
    }


}
