public class YouCanFixDividingByZero {
    public static void main(String[] args)
    {
        try {
            int BaseNumber = 42 / 0;
            System.out.println(BaseNumber);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
        System.out.println("This will print, as the excpetion will be caught and the program will continue!");
    }
}