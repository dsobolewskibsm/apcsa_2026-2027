public class BasicWhileLoopTwo
{
    public static void main(String[] args)
    {
        int foo = 1;
        int bar = 30_000_000;

        while(foo <= bar)
        {
            foo++;
            // System.out.println(foo);
        }

        System.out.println();
        System.out.println("This line will not print until foo reaches " + bar + ".");
    }
}