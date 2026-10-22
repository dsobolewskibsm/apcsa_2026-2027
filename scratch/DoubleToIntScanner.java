import java.util.Scanner;

public class DoubleToIntScanner{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int foo = 0;

        System.out.println("Enter an int!");
        foo = (int) scan.nextDouble();
        System.out.println(foo);


    }
}