import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(addition(1, 2));
        System.out.println(subtraction(1, 2));
        System.out.println(multiply(1, 2));
        System.out.println(division(1, 0));
        System.out.println(mod(1, 2));
        System.out.println(multiplier(2, 3));
        System.out.println(multiplierLoop(2, 10));
        System.out.println(recursionX(3, 3));
        diceRoll();



        int min = 1;
        int max = 10;
        int userInput;

        if(min <= max) {
            System.out.printf("Please enter a number between %d and %d: ", min, max);
            userInput = getInteger(min, max);
        } else {
            System.out.printf("Please enter a number between %d and %d: ", max, min);
            userInput = getInteger(max, min);
        }

        System.out.printf("You entered the number %d!\n", userInput);


        boolean userFinished = false;
        long factorialResult;
        min = -1;
        max = 20;

        do {
            System.out.printf("Enter number between %d and %d.\nEnter a number (-1 to quit): ", 1, max);
            userInput = getInteger(min, max);
            if (userInput >= 0) {
                factorialResult = factorial(userInput);
                System.out.printf("The factorial of %d is %d\n", userInput, factorialResult);
            } else {
                userFinished = true;
            }
        } while(!userFinished);








    }

    public static double addition(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double subtraction(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double division(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }

    public static double mod(double num1, double num2) {
        double result = num1 % num2;
        return result;
    }

    public static double multiplier(double a, double b) {

        // return a / (1 / b);

        // the above may be too rough
        // Java doesn't know that "(a / (b / 0)) == 0"
        // a special case for zero should probably be added:

        return 0 == b ? 0 : a / (1 / b);
    }

    // Using For loop
    public static int multiplierLoop(int a, int b) {
        int resultat = 0;
        for (int i = 0; i < a; i++) {
            resultat += b;
        }

        return resultat;
    }

    // using Recursion
    public static int recursionX(int a, int b) {

        if ((a == 0) || (b == 0))
            return 0;
        else
            return (a + recursionX(a, b - 1));

    }

    public static int getInteger(int min, int max) {
        Scanner inputStream = new Scanner(System.in);
        int input = inputStream.nextInt();

        if(input < min) {
            System.out.printf("ERROR: The number you entered (%d) is less than the min (%d)!\n", input, min);
            System.out.printf("Enter a number between %d and %d: ", min, max);
            return getInteger(min, max);
        } else if (input > max) {
            System.out.printf("ERROR: The number you entered (%d) is greater than the max (%d)!\n", input, max);
            System.out.printf("Please enter a number between %d and %d: ", min, max);
            return getInteger(min, max);
        }

        return input;
    }


    public static long factorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void diceRoll() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides for a pair of dice: ");
        double diceSides = sc.nextInt();
        System.out.println("Would you like to roll the dice?");
        String question = sc.next();
        if(question.equals("yes")) {
            System.out.println(randomNum(diceSides));
            System.out.println(randomNum(diceSides));
        }
    }

    public static double randomNum(double num) {
        return Math.random() * num + 1;
    }









}





















