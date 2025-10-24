package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo de Tunis", 3);

        Animal lion = new Animal("Félidés", "Lion", 5, true);
        Animal dauphin = new Animal("Cétacés", "Dauphin", 8, true);
        Animal pingouin = new Animal("Oiseaux", "Pingouin", 3, false);
        Animal chat = new Animal("Félidés", "Chat", -2, true); // âge invalide

        Animal[] animaux = { lion, dauphin, pingouin, chat, new Animal("Canidés", "Chien", 4, true) };

        for (Animal a : animaux) {
            try {
                zoo.addAnimal(a);
            } catch (ZooFullException e) {
                System.err.println("⚠️ " + e.getMessage());
            } catch (InvalidAgeException e) {
                System.err.println("⚠️ " + e.getMessage());
            } finally {
                System.out.println("Nombre total d’animaux : " + zoo.getAnimalCount());
                System.out.println("----------------------------");
            }
        }
    }
}
