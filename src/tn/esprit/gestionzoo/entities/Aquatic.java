package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {
        super();
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Aquatic other) {
            return this.getName().equalsIgnoreCase(other.getName())
                    && this.getAge() == other.getAge()
                    && this.habitat.equalsIgnoreCase(other.habitat);
        }
        return false;
    }
}
