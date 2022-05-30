package pl.korki.liquids;

public class Water extends Liquid {
    private boolean distilated;

    public Water(Liquid l1, boolean distilated) {
        super(l1.getName(), l1.getBaseReagent(), l1.getDissolubility());
        this.distilated = distilated;
    }

    @Override
    public double getBaseReagent() {
        if(distilated) {
            return super.getBaseReagent();
        } else {
            return super.getBaseReagent()/2;
        }
    }

    public boolean isDistilated() {
        return distilated;
    }

    public void setDistilated(boolean distilated) {
        this.distilated = distilated;
    }

    @Override
    public String toString() {
        return "[Water] Nazwa: " + getName() + " | Base Reagent: " + getBaseReagent() + " | Dissolublility: " + getDissolubility() + " | Distilated: " + isDistilated();
    }
}
