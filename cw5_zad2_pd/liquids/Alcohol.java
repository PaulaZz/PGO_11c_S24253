package pl.korki.liquids;

public class Alcohol extends Liquid {

    private double percentage;

    public Alcohol(Liquid l1, double percentage) {
        super(l1.getName(), l1.getBaseReagent(), l1.getDissolubility());
        this.percentage = percentage;
    }

    @Override
    public double getBaseReagent() {
        double procent = percentage/100.0, procentDoOdjecia = super.getBaseReagent()*procent;
        return super.getBaseReagent()-procentDoOdjecia;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString(){
        return ("[Alkohol] Nazwa: " + getName() + " | Basereagent: " + getBaseReagent() + " | Dissolubility: " + getDissolubility() + " | Percentage " + getPercentage());
    }

}
