package app;

//import java.time.LocalDate;

public class Expense {
    private int id;
    private String description;
    private double amount;
    // private LocalDate date;

    public Expense(double amount, String description, int id) {
        this.amount = amount;
        this.description = description;
        this.id = id;
        // this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double newAmount) {
        this.amount = newAmount;
    }

    // public LocalDate getDate() {
    // return date;

    @Override
    public String toString() {
        return "Amount:" + amount + ", " + "Description:" + description + ", " + "Id:" +
                id;

    }
}
