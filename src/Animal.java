public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getFamily() { return family; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isMammal() { return isMammal; }

    public void displayAnimal() {
        System.out.println("Animal: " + name + " | Famille: " + family +
                " | Âge: " + age + " | Mammifère: " + isMammal);
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', family='" + family +
                "', age=" + age + ", isMammal=" + isMammal + "}";
    }
}
