
package app;

import java.io.FileWriter;
import java.io.IOException;

public class ExpenseFile {

    public void writeToFile(Expense expense) {
        try {
            FileWriter writer = new FileWriter("expenses.csv");
            writer.write(expense.toString());
            System.out.println("Wrote to File!");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}