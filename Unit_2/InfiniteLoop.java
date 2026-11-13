public class InfiniteLoop
{
    static boolean foo = true;

    public static void main(String[] args)
    {
        while(foo)
        {
            System.out.println("This simple example is going to print once.");
            //foo = false;  
        }
    }
}