public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int animalCount;

    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = 25;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
    }

    public Zoo(String name, String city) {
        this(name, city, 25);
    }

    public void displayZoo() {
        System.out.println("Zoo: " + name + " | Ville: " + city +
                " | Nombre de cages: " + nbrCages);
    }

    public boolean addAnimal(Animal animal){
        if (isZooFull()) {
            System.out.println("Impossible d’ajouter, le zoo est plein !");
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("️Animal déjà présent !");
            return false;
        }
        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    public void displayAnimals() {
        System.out.println("🐾 Animaux dans le zoo " + name + " :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(" - " + animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equalsIgnoreCase(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) return false;

        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }

    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.animalCount >= z2.animalCount) ? z1 : z2;
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages + "}";
    }

    public String getName() { return name; }
    public String getCity() { return city; }
    public int getNbrCages() { return nbrCages; }
}
