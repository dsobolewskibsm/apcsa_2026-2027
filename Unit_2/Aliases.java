public class Aliases
{
    public static void main(String[] args)
    {
        //Note that lines 10 and 20 print the same.
        String human = "Bruce Wayne";
        String persona = "Bruce Wayne";
        String theGreatDetective = "Batman";

        System.out.println("Who does " + human + " think he is? He's " + persona + ".");

        System.out.println("");
        System.out.println("Joe Chill: \"Hey lady, gimmie those pearls.\"");
        System.out.println("Thomas Wayne: \"Calm down. You can have them, just leave my wife and son alone.\"");
        System.out.println("Joe Chill: Bang! Bang!");
        System.out.println("");

        persona = theGreatDetective;

        System.out.println("Who does " + human + " think he is? He's " + persona + ".");
    }
}