public class Dog implements Comparable<Dog> {
    private int age;
    private String breed;

    // Constructor
    public Dog(int age, String breed) {
        this.age = age;
        this.breed = breed;
    }

    // Getter and Setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter methods for breed
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // toString method
    @Override
    public String toString() {
        return "Dog [Breed: " + breed + ", Age: " + age + "]";
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Dog otherDog = (Dog) obj;
        return this.breed.equals(otherDog.breed);
    }

    // compareTo method
    @Override
    public int compareTo(Dog otherDog) {
        if (this.age < otherDog.age)
            return -1;
        else if (this.age > otherDog.age)
            return 1;
        else
            return 0;
    }
}
