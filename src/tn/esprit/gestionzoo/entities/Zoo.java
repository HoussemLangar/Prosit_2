package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int animalCount;
    private Aquatic[] aquaticAnimals;
    private int aquaticCount;
    private int MAX_CAPACITY;

    public Zoo(String name, String city, int nbrCages) {
        setName(name);
        this.city = city;

        if (nbrCages > 25) {
            System.out.println("Nombre de cages limité à 25 !");
            this.nbrCages = 25;
        } else {
            this.nbrCages = nbrCages;
        }

        this.animals = new Animal[this.nbrCages];
        this.animalCount = 0;
        this.aquaticAnimals = new Aquatic[10];
        this.aquaticCount = 0;
    }

    public Zoo(String name, int capacity) {
        this.name = name;
        this.MAX_CAPACITY = capacity;
        this.animals = new Animal[capacity];
        this.animalCount = 0;
    }

    public Zoo() {
        this("Zoo sans nom", "Ville inconnue", 25);
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

    public void addAquaticAnimal(Aquatic animal) {
        if (aquaticCount < aquaticAnimals.length) {
            aquaticAnimals[aquaticCount++] = animal;
            System.out.println(animal.getName() + " ajouté au zoo !");
        } else {
            System.out.println("Le zoo est plein, impossible d'ajouter plus d'animaux aquatiques.");
        }
    }

    public void makeAllSwim() {
        System.out.println("\n--- Les animaux aquatiques nagent ---");
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float getMaxPenguinDepth() {
        float maxDepth = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i];
                if (p.getSwimmingDepth() > maxDepth) {
                    maxDepth = p.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayCountByType() {
        int dolphinCount = 0, penguinCount = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) dolphinCount++;
            if (aquaticAnimals[i] instanceof Penguin) penguinCount++;
        }
        System.out.println("\nNombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name +
                "', city='" + city +
                "', nbrCages=" + nbrCages + "}";
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("Âge d’animal invalide : l’âge ne peut pas être négatif.");
        }

        if (animalCount >= MAX_CAPACITY) {
            throw new ZooFullException("Le zoo est plein, impossible d’ajouter un nouvel animal.");
        }

        animals[animalCount] = animal;
        animalCount++;
        System.out.println("✅ Animal ajouté : " + animal.getName());
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public String getName() { return name; }
    public String getCity() { return city; }
    public int getNbrCages() { return nbrCages; }

    public void setAnimals(Animal[] animals) { this.animals = animals; }
    public void setCity(String city) { this.city = city; }
    public void setAnimalCount(int animalCount) { this.animalCount = animalCount; }
    public void setName(String name) { this.name = name; }
}
