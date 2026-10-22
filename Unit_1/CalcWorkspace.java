public class CalcWorkspace {
    public static void main(String[] args) {
        ReturningCalculator rc = new ReturningCalculator();

        int solutionOne = rc.integerAdder(2, 3);
        double solutionTwo = rc.doubleMultiplier(3, 3);

        System.out.println(solutionOne);
        System.out.println(solutionTwo);
    }
}
