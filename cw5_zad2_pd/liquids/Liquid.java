package pl.korki.liquids;

import pl.korki.abstract_class.Ingredient;

public class Liquid extends Ingredient {
    private double dissolubility;

    public Liquid(String name, double baseReagent, double dissolubility) {
        super(name, baseReagent);
        this.dissolubility = dissolubility;
    }

    @Override
    public double getBaseReagent() {
        return ((super.getBaseReagent()/dissolubility) * 100); // obliczanie % rozpuszczalności
    }

    public double getDissolubility() {
        return dissolubility;
    }

    public void setDissolubility(double dissolubility) {
        this.dissolubility = dissolubility;
    }
}
