import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of dogs in the kennel: ");
        int numDogs = input.nextInt();
        input.nextLine(); // Consume the newline character

        double totalAge = 0;
        Dog oldestDog = null;

        for (int i = 1; i <= numDogs; i++) {
            System.out.println("Enter information for Dog #" + i + ":");
            System.out.print("Breed: ");
            String breed = input.nextLine();
            System.out.print("Age: ");
            int age = input.nextInt();
            input.nextLine(); // Consume the newline character

            Dog dog = new Dog(age, breed);
            totalAge += age;

            if (oldestDog == null || dog.compareTo(oldestDog) > 0) {
                oldestDog = dog;
            }
        }

        double averageAge = totalAge / numDogs;

        System.out.println("Average Age of Dogs: " + averageAge);
        System.out.println("Oldest Dog: " + oldestDog);
    }
}
