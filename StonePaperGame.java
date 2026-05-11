import java.util.Scanner;
import java.util.Random;

public class StonePaperGame {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        System.out.println("choose 1-rock  2-paper  3-siccors");
        int hminput=sc.nextInt();
        System.out.println("Computer value is :"+random);
        int cominput=random.nextInt();
        if(hminput==0 && cominput==0 ){
            System.out.println("tie");
        }


    }
}
