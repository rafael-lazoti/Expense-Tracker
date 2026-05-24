
package app;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExpenseFile {

    public void writeToFile(Expense expense) {
        try {
            FileWriter writer = new FileWriter("expenses.csv", true);
            writer.write(System.lineSeparator());
            writer.write(expense.toString());
            System.out.println("Wrote to File!");
            writer.close();
        } catch (IOException e) {
            System.out.println("A error occured: writer");
            e.printStackTrace();
        }

    }

    public void readFile(Expense expense) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("expenses.csv"));
            String line;
            int lastId = 0;
            // String[] parts = line.trim().split(",");

            while ((line = reader.readLine()) != null) {
                // System.out.println(line);
                String[] parts = line.trim().split(",");
                lastId = Integer.parseInt(parts[2]);
            }
            System.out.println(lastId);
            Expense.setNextId(lastId + 1);
            reader.close();

        } catch (IOException e) {
            System.out.println("A error occured: reader");
            e.printStackTrace();

        }
    }

}