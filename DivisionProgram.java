public class DivisionProgram {
    public static void main(String[] args) {
        try {
            int numerator = 11;
            int denominator = 0;
            divideNumbers(numerator, denominator);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }

    // Method to perform division with exception handling
    private static void divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        int result = numerator / denominator;
        System.out.println("Result of division: " + result);
    }
}
