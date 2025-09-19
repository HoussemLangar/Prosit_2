public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Félidés", "Lion", 5, true);
        Animal chat = new Animal("Félidés", "Chat", 3, true);
        Animal chien = new Animal("Canidés", "Chien", 4, true);
        Zoo myZoo = new Zoo("Safari Park", "Tunis", 25);

        System.out.println("-------- Résultats --------");

        System.out.println("Animal -> Nom: " + lion.getName() +
                ", Famille: " + lion.getFamily() +
                ", Âge: " + lion.getAge() +
                ", Mammifère: " + lion.isMammal());

        System.out.println("Zoo -> Nom: " + myZoo.getName() +
                ", Ville: " + myZoo.getCity() +
                ", Nombre de cages: " + myZoo.getNbrCages());

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(chat);
        System.out.println(chien.toString());
    }
}