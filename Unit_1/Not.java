import java.util.Scanner;

public class Not {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean aloneInCar = true;

        String currentlyPlaying = "";

        if(!aloneInCar)
        {
            System.out.println("Let's play something everyone likes.");
        }
        else
        {
            System.out.println("I'm just going to listen to my jams.");
        }

        System.out.print("How about : ");
        currentlyPlaying = scan.nextLine();
        scan.close();

        System.out.println(currentlyPlaying + " is now playing.");
    }
}
