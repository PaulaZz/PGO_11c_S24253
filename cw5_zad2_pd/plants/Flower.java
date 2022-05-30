package pl.korki.plants;

import pl.korki.minerals.Mineral;

public class Flower extends Plants{

    public Flower(Plants m1) {
        super(m1.getName(), m1.getBaseReagent(), m1.getToxity());
    }

    @Override
    public double getBaseReagent() {
            return super.getBaseReagent()*2;
    }

    @Override
    public String toString() {
        return "Flower: " + getName() + " | " + getBaseReagent() + " | " + getToxity() + " | ";
    }

}
