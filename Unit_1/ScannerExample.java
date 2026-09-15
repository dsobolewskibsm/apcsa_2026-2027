import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String favAnimal = "";
        String favFood = "";

        System.out.println("What's your favorite animal?");
        favAnimal = scan.nextLine();
        System.out.println("You like " + favAnimal);
        System.out.println("What's your favorite food?");
        favFood = scan.nextLine();
        System.out.println("You like " + favFood);
        
        scan.close();
    }
}