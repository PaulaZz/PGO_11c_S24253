package pl.korki.plants;

import pl.korki.abstract_class.Ingredient;
import pl.korki.minerals.Mineral;

public class Plants extends Ingredient {

    private double toxity;

    public Plants(String name, double baseReagent, double toxity) {
        super(name, baseReagent);
        this.toxity = toxity;
    }

    public double getToxity() {
        return toxity;
    }

    public void setToxity(double toxity) {
        this.toxity = toxity;
    }

    @Override
    public double getBaseReagent() {
        return super.getBaseReagent()*toxity;
    }

}
