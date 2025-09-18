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

        double doubleOperandA = 5.5;
        double doubleOperandB = 15.5;

        double doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " = " + doubleSum);

        double doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " = " + doubleProduct);

        double doubleDifference = doubleOperandB - doubleOperandA;
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " = " + doubleDifference);

        double doubleQuotient = doubleOperandB / doubleOperandA;
        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        int intKids = 3;
        System.out.println("The number of kids in my family is " + intKids);

        boolean IsItRaining = false;
        System.out.println("Is it raining? " + "false");

        int favNumber = 30;
        System.out.println("My favorite number is " + favNumber);

        double shoesSize = 11.5;
        System.out.println("My shoe size is " + shoesSize);

        int birthMonth = 1; // 1= January, 2= February, etc.
        String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("I was born in the month of "  + monthName [birthMonth - 1]);

        String fullName = "Marc Moye";
        System.out.println("My full name is " + fullName);



    }
}