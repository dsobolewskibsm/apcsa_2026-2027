import java.util.Scanner;

public class ScannerOddity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String foo = "";
        String bar = "";
        int footoo = 0;
        int bartoo = 0;

        System.out.print("Enter an int: ");
        footoo = scan.nextInt();
        System.out.println("You entered " + footoo);

        scan.nextLine();
        
        System.out.print("Enter a String: ");
        foo = scan.nextLine();
        System.out.println("you entered " + foo);

        System.out.print("Enter a String: ");
        foo = scan.nextLine();
        System.out.println("you entered " + foo);


        // System.out.print("Enter an int: ");
        // bartoo = scan.nextInt();
        // System.out.println("you entered " + bartoo);
    }
}
