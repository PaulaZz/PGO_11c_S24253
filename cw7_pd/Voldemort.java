package cw7_pd;

import java.util.ArrayList;
import java.util.List;

public class Voldemort extends Character {
    private Riddle riddle;
    private int horcruxes;
    private List<Character> targets;

    public Voldemort(Riddle riddle) {
        super("Lord Voldemort", Location.London);
        this.riddle = riddle;
        this.horcruxes = 0;
        this.targets = new ArrayList<>();
    }

    public void createHorcruxes(int horcruxes){
        this.horcruxes+=horcruxes;
    }

    public void printHorcruxes(){
        System.out.println("Created horcruxes:");
        for (int i = 0; i < horcruxes ; i++) {
            System.out.println("horcrux " + (i+1));
        }
    }

    public void castSpell(Spell spell){
        switch (spell) {
            case AvadaKedavra -> {
                for (Character ch : targets) {
                    if (ch.getName().equals("Harry")){
                        System.out.println("Harry goes LOL...");
                    } else
                    System.out.println(ch.getName() + " died.");
                }
                System.out.println("Lord Voldemort died.");
            }
        }
    }

    public void target(Character character) {
        targets.add(character);
    }

}
