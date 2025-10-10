package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages;
    private int animalCount;

    public Zoo(String name, String city, int nbrCages) {
        setName(name);
        this.city = city;

        if (nbrCages > 25) {
            System.out.println(" Nombre de cages limité à 25 !");
            this.nbrCages = 25;
        } else {
            this.nbrCages = nbrCages;
        }

        this.animals = new Animal[this.nbrCages];
        this.animalCount = 0;
    }

    public Zoo(String name, String city) {
        this(name, city, 25);
    }

    public void displayZoo() {
        System.out.println("Zoo: " + name +
                " | Ville: " + city +
                " | Nombre de cages: " + nbrCages);
    }

    public void displayAnimals() {
        System.out.println("🐾 Animaux dans le zoo " + name + " :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(" - " + animals[i]);
        }
    }


    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.animalCount >= z2.animalCount) ? z1 : z2;
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name +
                "', city='" + city +
                "', nbrCages=" + nbrCages + "}";
    }

    public String getName() { return name; }
    public String getCity() { return city; }
    public int getNbrCages() { return nbrCages; }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }

    public void setName(String name) {
        this.name = name;
    }
}
