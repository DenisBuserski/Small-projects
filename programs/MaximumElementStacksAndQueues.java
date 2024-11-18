package Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElementStacksAndQueues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String commandNum = command[0];


            if (commandNum.equals("1")) {
                int number = Integer.parseInt(command[1]);
                stack.push(number);

            } else if (commandNum.equals("2")) {
                stack.pop();

            } else if (commandNum.equals("3")) {
                getMax(stack);

            }
        }
    }

    private static void getMax(ArrayDeque<Integer> stack) {
        int maxNumber = Integer.MIN_VALUE;
        for (int number : stack) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println(maxNumber);
    }
}
