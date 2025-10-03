package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println(" L’âge ne peut pas être négatif. Mise à 0 par défaut.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void displayAnimal() {
        System.out.println("Animal: " + name +
                " | Famille: " + family +
                " | Âge: " + age +
                " | Mammifère: " + isMammal);
    }

    @Override
    public String toString() {
        return "Animal{name='" + name +
                "', family='" + family +
                "', age=" + age +
                ", isMammal=" + isMammal + "}";
    }
}
