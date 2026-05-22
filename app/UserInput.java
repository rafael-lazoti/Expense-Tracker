package app;

import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);

    public Expense getInput() {
        System.out.println("Cost:");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Description:");
        String description = scanner.nextLine();
        System.out.println("Id:");
        int id = scanner.nextInt();
        scanner.close();
        return new Expense(amount, description, id);

    }

}
