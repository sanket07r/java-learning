import java.util.Scanner;
public class DayProgram {
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a day :");
        int Day=sc.nextInt();

        switch (Day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wed");
            case 4 -> System.out.println("thur");
            case 5 -> System.out.println("fri");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }
    }
}
