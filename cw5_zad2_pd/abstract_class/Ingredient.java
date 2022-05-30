package pl.korki.abstract_class;

public abstract class Ingredient {
    private String name;
    private double baseReagent; // zmieniamy typ na double aby latwiej bylo pozniej obliczac procenty i nie sypal nam ciagle zerami

    public Ingredient(String name, double baseReagent) {
        this.name = name;
        this.baseReagent = baseReagent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseReagent() {
        return baseReagent;
    }

    public void setBaseReagent(double baseReagent) {
        this.baseReagent = baseReagent;
    }
}
