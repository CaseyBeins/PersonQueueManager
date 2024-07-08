import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            queue.addPerson(new Person(firstName, lastName, age));
        }

        System.out.println("\nQueue before sorting:");
        queue.displayQueue();

        queue.sortByName();
        System.out.println("\nQueue sorted by last name (descending):");
        queue.displayQueue();

        queue.sortByAge();
        System.out.println("\nQueue sorted by age (descending):");
        queue.displayQueue();
    }
}
