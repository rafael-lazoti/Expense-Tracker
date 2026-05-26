package app;

import java.math.BigDecimal;
import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);

    public Expense getInput() {
        // int decision;
        BigDecimal amount;
        String description;
        // do {
        System.out.println("Cost:");
        amount = scanner.nextBigDecimal();
        scanner.nextLine();
        System.out.println("Description:");
        description = scanner.nextLine();

        // return new Expense(amount, description);

        // System.out.println("Add another task: 1");
        // System.out.println("Exit Program: 2");
        // decision = scanner.nextInt();
        // } while (decision <= 1);

        // {
        return new Expense(amount, description);

        // }

    }

}
