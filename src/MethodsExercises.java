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
        System.out.print(multiplierLoop(2, 10));
        System.out.print(recursionX(3, 3));


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





}









