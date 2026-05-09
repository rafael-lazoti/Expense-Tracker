package app;

import storage.FileManager;
// Starts the program

public class Main {
  public static void main(String[] args) {
    System.out.println("Program Started!");

    FileManager fm = new FileManager();
    fm.writeTest();

  }
}