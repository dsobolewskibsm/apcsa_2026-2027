public class IfElseStatements
{
    public static void main(String[] args)
    {
        boolean varOne = true;
        int varTwo = 120;
        int varThree = 24;
        String varFour = "dog";
        String varFive = "cat";
        String varSix = "dog";

        if(varTwo > varThree) {
            System.out.println("This statement evaluated to true.");
        }
        else
        {
            System.out.println("This statement triggered the else statement, which means the condition one condition we test in this program is false. But remember - else does not mean false.");
        }
    }
}