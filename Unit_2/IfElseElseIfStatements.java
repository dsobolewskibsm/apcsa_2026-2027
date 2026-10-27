public class IfElseElseIfStatements
{
    public static void main(String[] args)
    {
        boolean varOne = true;
        int varTwo = 122;
        int varThree = 24;
        String varFour = "dog";
        String varFive = "cat";
        String varSix = "dog";

        if(varOne)
        {
            System.out.println("The first statement evaluated to true.");
        }
        else if(varTwo < varThree)
        {
            System.out.println("The second statement evaluated to true.");
        }
        else if(varFour == varSix)
        {
            System.out.println("The third statement evaluated to true.");
        }
        else
        {
            System.out.println("This statement triggered the else statement, which means all other conditions were false.");
        }
    }
}