import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Writing to the file
            System.out.println("---");
            System.out.println("Written Information:");
            System.out.println("---");

            FileWriter writer = new FileWriter("information.txt");
            BufferedWriter buffer = new BufferedWriter(writer);

            Scanner userInput = new Scanner(System.in);

            System.out.println("Enter your full name:");
            String fullName = userInput.nextLine();

            System.out.println("Enter your age:");
            int age = userInput.nextInt();

            System.out.println("Enter your gender:");
            String gender = userInput.next();

            String textFileTextFormat = fullName + "#" + age + "#" + gender;
            System.out.println(textFileTextFormat);

            buffer.write(textFileTextFormat);

            buffer.close();
            writer.close();

            System.out.println("---");
            System.out.println("Read Information:");
            System.out.println("---");

            ReadFile read = new ReadFile();

            read.readFile();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}