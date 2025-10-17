package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Dolphin d1 = new Dolphin("Delphinidae", "Flipper", 10, true, "Ocean", 25.5f);
        Dolphin d2 = new Dolphin("Delphinidae", "Blue", 8, true, "Mer", 30f);
        Penguin p1 = new Penguin("Spheniscidae", "Pingu", 4, false, "Antarctique", 15.2f);
        Penguin p2 = new Penguin("Spheniscidae", "Snow", 6, false, "Bassin", 12f);

        zoo.addAquaticAnimal(d1);
        zoo.addAquaticAnimal(d2);
        zoo.addAquaticAnimal(p1);
        zoo.addAquaticAnimal(p2);

        zoo.makeAllSwim();
        zoo.displayCountByType();
        System.out.println("\nProfondeur maximale des pingouins : " + zoo.getMaxPenguinDepth() + " m");

        System.out.println("\nD1 == D2 ? " + d1.equals(d2));
    }
}
