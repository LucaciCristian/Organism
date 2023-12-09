package ro.scoalainformala;

public abstract class Organism {
    private String name;
    private String species;

    public Organism(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Organism{" +
                "name='" + name + '\'' + ", species='" + species + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Organism organism = (Organism) obj;
        return name.equals(organism.name) && species.equals(organism.species);
    }
}
