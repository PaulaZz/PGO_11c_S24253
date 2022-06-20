package cw7_pd;

public class Character {

    private String name;
    private Location location;

    public Character(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public Location getLocation(){
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void introduce(){
        System.out.println("Hello, I am "+name);
    }

    public void moveTo(Orphanage orphanage){
        this.location = orphanage.getLocation();
    }

    public void moveTo(Location location){
        this.location = location;
    }

    public static void MoveAllTo(Location location, Character character1, Character character2) {
        character1.setLocation(location);
        character2.setLocation(location);
    }

    public static void MoveAllTo(Location location, Character character1, Character character2, Character character3) {
        character1.setLocation(location);
        character2.setLocation(location);
        character3.setLocation(location);
    }

    public void say(String zdanie, Character character){
        System.out.println(this.getName() + " to " + character.getName());
        System.out.println("\t" + zdanie);
    }

    public void doSth(String sth) {
        System.out.println("I am " + this.getName() + ", I am " + sth);
    }

    public static void doSth(String sth, Character ch1, Character ch2, Character ch3) {
        System.out.println("I am " + ch1.getName() + ", I am " + sth);
        System.out.println("I am " + ch2.getName() + ", I am " + sth);
        System.out.println("I am " + ch3.getName() + ", I am " + sth);
    }
}
