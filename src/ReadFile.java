import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public void readFile() {
        try {
            // Reading from the file
            Scanner scan = new Scanner(new File("information.txt"));

            String fullName = "";
            int age = 0;
            String gender = "";

            while(scan.hasNext()) {
                String line = scan.nextLine();

                String information[] = line.split("#");

                fullName = information[0];
                age = Integer.parseInt(information[1]);
                gender = information[2];
            }

            System.out.println("Full Name: " + fullName + "\nAge: " + age + "\nGender: " + gender);
            scan.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}