import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        try {
            // String path = "ExampleData_1.csv"; // Example 1
            String path = "ExampleData_2.csv"; // Example 2

            Scanner scanner = new Scanner(new FileReader(path));
            scanner.nextLine();

            double mean = 0;
            int countOfElements = 0;
            List<Double> elements = new ArrayList<>();

            while (scanner.hasNext()) {
                String[] line = scanner.next().split(",");
                double number = Double.parseDouble(line[3]);
                countOfElements++;
                mean += number;
                elements.add(number);
            }

            System.out.println("Mean value: " + (mean / countOfElements));

            if (elements.size() % 2 == 0) {
                Collections.sort(elements);
                double medianValue = elements.get(elements.size() / 2);
                System.out.println("Median value: " + medianValue);
            } else if (elements.size() % 2 != 0) {
                Collections.sort(elements);
                double medianValue1 = elements.get(elements.size() / 2);
                double medianValue2 = elements.get(elements.size() / 2) + 1;
                System.out.println("Median value: " + medianValue1 + " " + medianValue2);
            }

        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
