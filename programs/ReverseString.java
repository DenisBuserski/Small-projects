import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder input = new StringBuilder();
        
        input.append(text);
        input.reverse();
        System.out.println(input.toString());

        
        String name = scanner.nextLine();
        // Last position = String length - 1
        // Denis -> 01234 -> 5 - 1 = 4 -> Last symbol
        
        String reverse = " ";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }
        
        System.out.println(reverse);
    }
}
