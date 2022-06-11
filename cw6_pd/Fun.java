package cw6_pd;

public interface Fun {

    double f(double x);

    static double minimum(Fun func, double a, double b, double alpha){
        double min = Double.MAX_VALUE;
        if (a < b) {
            for (double i = a; i <= b; i+=alpha) {
                if (func.f(i) < min) min = func.f(alpha);
            }
        }
        return min;
    }

}
