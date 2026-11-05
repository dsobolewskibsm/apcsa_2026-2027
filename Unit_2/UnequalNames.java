import java.util.Scanner;

public class UnequalNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameUno = "Duke Thunderpunch";
        String nameDos = "Duke Thunderpunch";
        String nameTres = new String("Duke Thunderpunch");
        
        System.out.println("Enter the name, \"Duke Thunderpunch\", spelled exactly that way...");

        String nameQuatro = scan.nextLine();

        scan.close();

        // boolean doesNameUnoEqualNameDosWithEqualSign = nameUno == nameDos;
        // boolean doesNameUnoEqualNameTresWithEqualSign = nameUno == nameTres;
        // boolean doesNameUnoEqualNameQuatroWithEqualSign = nameUno == nameQuatro;


        // System.out.println("Does " + nameUno + " equal " + nameDos +  "? " + doesNameUnoEqualNameDosWithEqualSign);
        // System.out.println("Does " + nameUno + " equal " + nameTres +  "? " + doesNameUnoEqualNameTresWithEqualSign);
        // System.out.println("Does " + nameUno + " equal " + nameQuatro +  "? " + doesNameUnoEqualNameQuatroWithEqualSign);














        boolean doesNameUnoEqualNameDosWithDotEquals = nameUno.equals(nameDos);
        boolean doesNameUnoEqualNameTresWithDotEquals = nameUno.equals(nameTres);
        boolean doesNameUnoEqualNameQuatroWithDotEquals = nameUno.equals(nameQuatro);

        System.out.println("\n***\n");

        System.out.println("Does " + nameUno + " equal " + nameDos +  "? " + doesNameUnoEqualNameDosWithDotEquals);
        System.out.println("Does " + nameUno + " equal " + nameTres +  "? " + doesNameUnoEqualNameTresWithDotEquals);
        System.out.println("Does " + nameUno + " equal " + nameQuatro +  "? " + doesNameUnoEqualNameQuatroWithDotEquals);


    }
}