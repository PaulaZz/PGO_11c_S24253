package pl.korki.eliksir;

import pl.korki.abstract_class.Ingredient;
import pl.korki.liquids.Liquid;

import java.util.ArrayList;
import java.util.List;

public class Eliksir {

    private String name;
    private boolean isCreated;
    private double power;
    private List<Ingredient> ingredients;
    private Liquid catalyst;

    public Eliksir(String name) {
        this.name = name;
        this.isCreated = false;
        this.power = 0;
        ingredients = new ArrayList<>();
        catalyst = new Liquid("liquid", 1.0, 1.0);
    }

    public void Create() {
        for (Ingredient i1 : ingredients) {
            power += i1.getBaseReagent();
        }
        power/=catalyst.getBaseReagent();
        this.isCreated = true;
    }
    public void addIngredient(Ingredient i1) {
        if (!isCreated)
        this.ingredients.add(i1);
    }

    public void removeIngredient(Ingredient i1) {
        if (!isCreated)
        this.ingredients.remove(i1);
    }

    public void setCatalyst(Liquid catalyst) {
        if (!isCreated)
        this.catalyst = catalyst;
    }

    public String getName() {
        return name;
    }

    public double getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Eliksir: " + getName() + " | " + getPower();
    }
}
