package ro.scoalainformala;

public class Main {
    public static void main(String[] args) {
        Organism[] organisms = new Organism[]{
                new Dog("Rex", "Labrador", 3),
                new Cat("Tom", true),
        };

        for (Organism organism : organisms) {
            System.out.println("Organism: " + organism);
        }
    }
}

