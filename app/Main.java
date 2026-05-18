package app;

import java.time.LocalDate;

// Starts the program

public class Main {
  public static void main(String[] args) {

    Storage storage = new Storage();

    Expense expense = new Expense(40.0, "Haircut", 001, LocalDate.now());

    storage.addExpense(expense);

    storage.displayExpenses();
  }
}