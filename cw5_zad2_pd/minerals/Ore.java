package pl.korki.minerals;

public class Ore extends Mineral {
    private boolean metalic;

    public Ore(Mineral m1, boolean metalic) {
        super(m1.getName(), m1.getBaseReagent(), m1.getPower()); // przy tworzeniu obiektu podwaja wartość
        this.metalic = metalic;
    }

    @Override
    public double getBaseReagent() {
        if (!metalic) {
            return super.getBaseReagent()/2; // tutaj dzieli przez 2
        } else
        return super.getBaseReagent(); // tutaj w metodzie juz ma podwojoną wartośc - DLACZEGO?
    }

    public boolean isMetalic() {
        return metalic;
    }

    public void setMetalic(boolean metalic) {
        this.metalic = metalic;
    }

    @Override
    public String toString() {
        return "Ore: " + getName() + " | " + getBaseReagent() + " | " + getPower() + " | " + isMetalic();
    }
}
