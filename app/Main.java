package app;

//import java.time.LocalDate;

// Starts the program

public class Main {
  public static void main(String[] args) {

    Storage storage = new Storage();

    ExpenseFile file = new ExpenseFile();

    UserInput input = new UserInput();

    Expense expense = input.getInput();

    // input.getInput();
    // Expense expense = new Expense(40.0, "Haircut", 001, LocalDate.now());

    storage.addExpense(expense);

    file.writeToFile(expense);

    storage.displayExpenses();

  }
}