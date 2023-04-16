import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Character> alphabet = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

        String input = scanner.nextLine();
        String[] split = input.split("");
        int step = Integer.parseInt(scanner.nextLine());

        for (String s : split) {
            Character character = alphabet.stream().filter(letter -> letter.toString().equals(s)).findFirst().orElse(' ');
            int letter = alphabet.indexOf(character);

            if (letter + step >= alphabet.size()) {
                System.out.print(alphabet.get((letter + step) - alphabet.size()));
            } else if (letter == -1) {
                System.out.print(" ");
            } else {
                System.out.print(alphabet.get(letter + step));
            }

        }
    }
}
