package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {

        Aquatic aquatic = new Aquatic();
        Terrestrial terrestrial = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        Dolphin dolphin2 = new Dolphin("Delphinidae", "Flipper", 8, true, "Océan", 25.4f);
        Penguin penguin2 = new Penguin("Spheniscidae", "Pingo", 4, false, "Antarctique", 12.5f);
        Terrestrial lion = new Terrestrial("Félidés", "Lion", 6, true, 4);

        System.out.println(dolphin2);
        System.out.println(penguin2);
        System.out.println(lion);

        aquatic.swim();
        dolphin2.swim();
    }
}
