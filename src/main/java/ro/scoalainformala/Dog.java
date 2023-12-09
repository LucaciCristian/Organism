package ro.scoalainformala;

public class Dog extends Organism {
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        super(name, "Dog");
        this.breed = breed;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Dog{" + "name='" + getName() + '\'' + ", species='" + getSpecies() + '\'' +
                ", breed='" + breed + '\'' + ", age=" + age + '}';
    }
}

