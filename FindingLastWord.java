import java.util.Scanner;

public class FindingLastWord {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a website url :");
        String website=sc.next();
        
        if(website.endsWith(".com")){
            System.out.println("commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("Orgnizational website");
        }
        else if(website.endsWith(".in")){
            System.out.println("Indian website");
        }
    
    }
    
}
