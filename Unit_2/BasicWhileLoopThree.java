public class BasicWhileLoopThree
{
    public static void main(String[] args)
    {

        int foo = 1;
        // int bar = 2_000_000_000;
        int bar = Integer.MAX_VALUE;
        int numberToDivideBy = 10_000_000;

        while(foo <= bar)
        {
            if(foo % numberToDivideBy == 0){
                System.out.println("This number is divisible by " + numberToDivideBy + ": " + foo);
            }
            foo++;
        }

        System.out.println();
        System.out.println("This will not print until foo reaches " + bar + ".");
    }
}