package app;

import java.math.BigDecimal;
import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);

    public Expense getInput() {
        System.out.println("Cost:");
        BigDecimal amount = scanner.nextBigDecimal();
        scanner.nextLine();
        System.out.println("Description:");
        String description = scanner.nextLine();

        return new Expense(amount, description);

    }

}
