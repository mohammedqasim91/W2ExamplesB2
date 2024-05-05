import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  throws IOException {

        FileWriter writer = new FileWriter("result.txt", true);

        File file = new File("oscar_age_female.csv");

        Scanner eyes = new Scanner(file);

        String data = eyes.nextLine();

        while (eyes.hasNextLine()) {
            data = eyes.nextLine();
            String[] row = data.split(",");

            writer.write("Name:" + row[3] + "\n");
            writer.write("Year:" + row[1] + "\n");
            writer.write("Age:" + row[2] + "\n");
            writer.write("Movie:" + row[4] + "\n");
            writer.write("==================" + "\n");
        }

        eyes.close();
        writer.close();


    }
}