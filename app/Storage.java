package app;

import java.util.ArrayList;

public class Storage {

    private ArrayList<Expense> expenses;

    public Storage() {
        expenses = new ArrayList<>();

    }

    public void addExpense(Expense expense) {
        expenses.add(expense);

    }

    public void displayExpenses() {
        for (Expense expense : expenses) {
            System.out.println(
                    "Amount:" + expense.getAmount() + ", " + "Description:" + expense.getDescription() + ", " + "Id:" +
                            expense.getId() + ", " + "Date:" + expense.getDate());
        }
    }
}
