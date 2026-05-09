package storage;
// Handles saving /loading expenses - keeps file logic separate

import java.io.FileWriter;
//import java.io.BufferedReader;
import java.io.IOException;

public class FileManager {

    public void writeTest() {

        try (FileWriter writer = new FileWriter("expenses.csv")) {

            writer.write("Hello, Java FileWriter!");
            System.out.println("Succescefully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();

        }

    }

}
