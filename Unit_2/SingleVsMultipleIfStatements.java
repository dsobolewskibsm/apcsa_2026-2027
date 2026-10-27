public class SingleVsMultipleIfStatements {
    public static void main(String[] args) {
        boolean singleStatements = true;
        boolean multipleStatementsIf = false;
        boolean multipleStatementsElseIf = false;

        if(singleStatements) {
            System.out.println("This is the first statement.");
        }
        if(singleStatements) {
            System.out.println("This is the second statement.");
        }
        if(singleStatements) {
            System.out.println("This is the third statement.");
        }

        if(multipleStatementsIf) {
            System.out.println("This is the if of the fourth statemenst");
        }
        else if(multipleStatementsElseIf) {
            System.out.println("This is the else if of the fourth statement");
        }
        else {
            System.out.println("This is the else of the fourth statement");
        }
    }
    
}
