public class Dog extends Animal {

    private String breed;

    public Dog(String animalName, String ownerName, int age, String breed) {
        super(animalName, ownerName, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal: " + getAnimalName() + ", Owner: " + getOwnerName() + ", Age: " + getAge() + ", Breed: " + breed;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Dog)) {
            return false;
        }

        Dog other = (Dog) obj;

        if (!getAnimalName().equals(other.getAnimalName())) {
            return false;
        }

        if (!getOwnerName().equals(other.getOwnerName())) {
            return false;
        }

        if (getAge() != other.getAge()) {
            return false;
        }

        if (!breed.equals(other.breed)) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Buddy", "Alice", 3, "Labrador");
        Dog d2 = new Dog("Buddy", "Alice", 3, "Labrador");
        Dog d3 = new Dog("Max", "Tom", 5, "Bulldog");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
    }
}