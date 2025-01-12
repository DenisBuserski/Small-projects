package Inheritance.use-super;

import java.util.Scanner;

class Challenge{

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int sum=0;

        System.out.println("Enter the number of apples:");
        int num1=scanner.nextInt();
        System.out.println("Enter the number of bananas:");
        int num2=scanner.nextInt();
        Banana obj = new Banana(num1,num2);
        obj.show();

    }

}