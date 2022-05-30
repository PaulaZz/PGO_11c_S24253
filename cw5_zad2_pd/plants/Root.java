package pl.korki.plants;

public class Root extends Plants{

    public Root(Plants m1) {
        super(m1.getName(), m1.getBaseReagent(), m1.getToxity());
    }

    @Override
    public double getBaseReagent() {
        return super.getBaseReagent()/2;
    }

    @Override
    public String toString() {
        return "Root: " + getName() + " | " + getBaseReagent() + " | " + getToxity() + " | ";
    }
}
