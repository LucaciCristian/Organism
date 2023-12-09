package ro.scoalainformala;

public class Cat extends Organism {
    private boolean isDomestic;

    public Cat(String name, boolean isDomestic) {
        super(name, "Cat");
        this.isDomestic = isDomestic;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean isDomestic) {
        this.isDomestic = isDomestic;
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + getName() + '\'' + ", species='" + getSpecies() + '\'' +
                ", isDomestic=" + isDomestic +
                '}';
    }
}

