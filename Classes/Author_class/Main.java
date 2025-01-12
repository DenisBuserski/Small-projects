package EXERCISE.programmr_com.Classes.Author_class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Author aut;

        System.out.println("Enter name:");
        String somename = scanner.nextLine();

        System.out.println("Enter email:");
        String semail = scanner.nextLine();

        System.out.println("Enter book name:");
        String sbook = scanner.nextLine();

        aut = new Author(somename, semail, sbook);

        System.out.println(aut.name+"\n"+aut.email+"\n"+aut.book);
    }
}
