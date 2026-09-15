public class RandomNumbers
{
   public static void main(String[] args)
   {
      int topOfRange = 20;

      double rndNumber = (Math.random());

      int rndNumberTwo = (int)(rndNumber * topOfRange) + 1;
      //What range is the above line actually giving us?

      System.out.println(rndNumber);
      System.out.println(rndNumberTwo);
   }
}