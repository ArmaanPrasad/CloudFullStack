package day1_java;
import java.util.Scanner;


public class inputMethods {
    public static void main(String[]args)
    {
        System.out.println("Start small. Ship something.");
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your email");
        String email = sc.nextLine();
        
        System.out.println("Enter your number : ");
        long  num = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the password ");
        String pass = sc.nextLine();
        
        System.out.println(name +" "+ " "+ age + " "+ email + " "+ num +" "+ pass);
        
    }
}
