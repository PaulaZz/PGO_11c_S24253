package pl.korki.minerals;

public class Crystal extends Mineral {
    private double magicPower;

    public Crystal(Mineral m1, double magicPower) {
        super(m1.getName(), m1.getBaseReagent(), m1.getPower());
        this.magicPower = magicPower;
    }

    @Override
    public double getBaseReagent() {
        return super.getBaseReagent()+magicPower;
    }

    public void setMagicPower(double magicPower) {
        this.magicPower = magicPower;
    }

    public double getMagicPower() {
        return this.magicPower;
    }
    @Override
    public String toString() {
        return "Crystal: " + getName() + " | " + getBaseReagent() + " | " + getPower() + " | " + getMagicPower();
    }
}
