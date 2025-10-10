package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal() {
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("⚠️ Âge invalide, mis à 0 par défaut !");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', family='" + family + "', age=" + age + ", isMammal=" + isMammal + "}";
    }
}
