package app;

import java.math.BigDecimal;

//import java.time.LocalDate;

public class Expense {
    private int id;
    private static int nextId = 1;
    private String description;
    private BigDecimal amount; // Big Decimal instead of double because for banking numbers have to be very
                               // precise
    // private LocalDate date;

    public Expense(BigDecimal amount, String description) {
        this.amount = amount;
        this.description = description;
        this.id = nextId;
        nextId++;
        // this.date = date;
    }

    public static void setNextId(int newValue) {
        nextId = newValue;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal newAmount) {
        this.amount = newAmount;
    }

    // public LocalDate getDate() {
    // return date;

    @Override
    public String toString() {
        return amount + "," + description + "," + id;

    }

}
