public class VariableMath
{
    public static void main(String[] args)
    {
        int firstNum = 4;
        int secondNum = 6;
        int thirdNum = 24;

        int sampleAdding = firstNum + secondNum;
        int sampleSubtraction = secondNum - firstNum;
        int sampleMultiplication = thirdNum * firstNum;
        int sampleDivision = thirdNum / secondNum;

        System.out.println(firstNum + " plus " + secondNum + " is " + sampleAdding + ".");
        System.out.println(secondNum + " minus " + firstNum + " is " + sampleSubtraction + ".");
        System.out.println(thirdNum + " times " + firstNum + " is " + sampleMultiplication + ".");
        System.out.println(thirdNum + " divided by " + secondNum + " is " + sampleDivision + ".");
    }
}