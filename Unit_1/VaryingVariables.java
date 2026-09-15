public class VaryingVariables
{
    public static void main(String[] args)
    {
        int aNumber = 7;

        System.out.println("The current aNumber is " + aNumber + ".");
        aNumber = 42;
        System.out.println("The current aNumber is " + aNumber + ".");
        aNumber = 3_000;
        System.out.println("The current aNumber is " + aNumber + ".");
        aNumber = 2_000_000_000;
        System.out.println("The current aNumber is " + aNumber + ".");
        aNumber = 8;
        System.out.println("The current aNumber is " + aNumber + ".");
    }
}