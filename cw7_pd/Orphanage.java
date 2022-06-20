package cw7_pd;

import java.util.ArrayList;
import java.util.List;

public class Orphanage {

    private String name;
    private Location location;
    private List<Child> listaDzieci;

    public Orphanage(String name, Location location) {
        this.name = name;
        this.location = location;
        this.listaDzieci = new ArrayList<>();
    }

    public void addChild(Child dziecko){
        listaDzieci.add(dziecko);

    }

    public Location getLocation() {
        return location;
    }


}
