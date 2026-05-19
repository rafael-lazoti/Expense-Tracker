package app;

import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);

    public String getInput() {
        System.out.println("Cost:");
        double amount = scanner.nextDouble();
        System.out.println("Description:");
        String description = scanner.nextLine();
        System.out.println("Id:");
        int id = scanner.nextInt();
        return new Expense(amount, description, id);

    }

}
