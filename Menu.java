import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the choice 1 or 0");
        int ch=in.nextInt();
        switch (ch) {
            case 1: System.out.println("Enter the marks out of 100");
            int marks=in.nextInt();
            if (marks>=90) {
                System.out.println("This is good");
                
            }
            else if (marks>=60 && marks<90) {
                System.out.println("This is also good");
                
            }
            else {
                System.out.println("This is good as well");
            }
                
                break;
        
            default: System.out.println("Invalid");
                break;
        }
    }
}