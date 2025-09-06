/*
 * FileHandlingUtility.java
 * ------------------------
 * A simple program that demonstrates file handling in Java.
 * Operations included: Write, Read, and Modify text files.
 */

import java.io.*;
import java.util.Scanner;

public class FileHandlingUtility {

    // File path (you can change as needed)
    private static final String FILE_NAME = "sample.txt";

    // Method to write to file
    public static void writeFile(String content) {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            writer.write(content);
            System.out.println("✅ File written successfully!");
        } catch (IOException e) {
            System.out.println("❌ Error writing file: " + e.getMessage());
        }
    }

    // Method to read file content
    public static void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("📖 Reading file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }
    }

    // Method to append/modify file
    public static void modifyFile(String content) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write("\n" + content);
            System.out.println("✏️ File modified successfully!");
        } catch (IOException e) {
            System.out.println("❌ Error modifying file: " + e.getMessage());
        }
    }

    // Main program to demonstrate all operations
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== FILE HANDLING UTILITY ====");
        System.out.println("1. Write to file");
        System.out.println("2. Read from file");
        System.out.println("3. Modify (append) file");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) {
            case 1:
                System.out.println("Enter text to write:");
                String writeData = sc.nextLine();
                writeFile(writeData);
                break;

            case 2:
                readFile();
                break;

            case 3:
                System.out.println("Enter text to append:");
                String modifyData = sc.nextLine();
                modifyFile(modifyData);
                break;

            default:
                System.out.println("❌ Invalid choice!");
        }

        sc.close();
    }
}
