public class Animal {

    private String animalName;
    private String ownerName;
    private int age;

    public Animal(String animalName, String ownerName, int age) {
        this.animalName = animalName;
        this.ownerName = ownerName;

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        this.age = age;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Wrong age");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal: " + animalName + ", Owner: " + ownerName + ", Age: " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Animal)) {
            return false;
        }

        Animal other = (Animal) obj;

        if (!animalName.equals(other.animalName)) {
            return false;
        }

        if (!ownerName.equals(other.ownerName)) {
            return false;
        }

        if (age != other.age) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Animal a1 = new Animal("Cat", "Bob", 2);
        Animal a2 = new Animal("Cat", "Bob", 2);
        Animal a3 = new Animal("Dog", "Ali", 4);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
    }
}