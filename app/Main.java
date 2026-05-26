package app;

//import java.time.LocalDate;

// Starts the program

public class Main {
  public static void main(String[] args) {

    Storage storage = new Storage();

    ExpenseFile file = new ExpenseFile();

    UserInput input = new UserInput();

    Expense expense = input.getInput();

    storage.addExpense(expense);

    file.readFile(expense);

    file.writeToFile(expense);

    // storage.displayExpenses();

  }
}