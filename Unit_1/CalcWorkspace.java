public class CalcWorkspace {
    public static void main(String[] args) {
        ReturningCalculator calculator = new ReturningCalculator();

        int firstEquation = calculator.integerAdder(3, 4);
        int secondEquation = calculator.integerAdder(5, 8);
        int sumOfFirstAndSecondEquation = calculator.integerAdder(firstEquation, secondEquation);

        System.out.println(sumOfFirstAndSecondEquation);
    }
}
