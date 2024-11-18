package Exercise;

import java.util.Scanner;

public class BinaryConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int to binary
        int number = Integer.parseInt(scanner.nextLine());
        String binary = Integer.toBinaryString(number);
        System.out.println(binary);

        // binary to int
        String binary2 = scanner.nextLine();
        int number2 = Integer.parseInt(binary2, 2);
        System.out.println(number2);



    }
}
