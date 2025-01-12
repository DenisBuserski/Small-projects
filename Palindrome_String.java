package EXERCISE.programmr_com.Miscellaneous;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome_String {
    public static void main(String a[]) throws Exception {
        String strn;
        int flag = 0;
        System.out.println("Enter the string:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strn = br.readLine();
        System.out.println("Result string is:");


        StringBuilder input = new StringBuilder();
        input.append(strn);
        input.reverse();

        if (input.toString().equals(strn)) {
            flag = 1;
        }



        if (flag == 1)
            System.out.print("palindrome");
        else
            System.out.print("not a palindrome");

    }
}
