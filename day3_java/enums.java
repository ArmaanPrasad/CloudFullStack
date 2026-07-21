package day3_java;
import java.util.Scanner;
enum Day{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}
public class enums{

    public static void printDay(Day day)
    {
         switch (day) {
            case Monday:
            System.out.println("Weekday : Monday");
                break;

            case Tuesday:
            System.out.println();
         
            default:
                break;
         }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();

    }
}