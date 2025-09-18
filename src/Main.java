public class Main {
    public static void main(String[] args) {
        int intOperandA = 5;
        int intOperandB = 15;

        int intSum = intOperandA + intOperandB;
        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " = " + intSum);

        int intProduct = intOperandA * intOperandB;
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " = " + intProduct);

        int intDifference = intOperandB - intOperandA;
        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " = " + intDifference);

        int intQuotient = intOperandB - intOperandA;
        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        int intModulo = intOperandA % intOperandB;
        System.out.println("The modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        double doubleOperandA = (double)5.5F;
        double doubleOperandB = (double)15.5F;

        double doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        double doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        double doubleDifference = doubleOperandB - doubleOperandA;
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        double doubleQuotient = doubleOperandB / doubleOperandA;
        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
    }
}