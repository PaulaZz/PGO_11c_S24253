package pl.korki.minerals;

import pl.korki.abstract_class.Ingredient;

public class Mineral extends Ingredient {
    private double power;

    public Mineral(String name, double baseReagent, double power) {
        super(name, baseReagent);
        this.power = power;
    }

    @Override
    public double getBaseReagent() {
        return super.getBaseReagent()+power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
