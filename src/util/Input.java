package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;



    // Constructor
    public Input() {
        this.scanner = new Scanner(System.in);
    }




    //Methods
    private String getString(){
        return this.scanner.nextLine();
    }

    public String getString(String prompt){
        if(prompt.isEmpty()){
            System.out.println("Type something: ");
        } else {
            System.out.println(prompt);
        }
        return getString();
    }

    public boolean yesNo(){
        String check = this.scanner.nextLine();
        return check.equalsIgnoreCase("yes") || check.equalsIgnoreCase("y");
    }

//    public int getInt(int min, int max){
//        int userInput = getInt();
//        if(userInput >= min && userInput <= max){
//            return userInput;
//        }else {
//            System.out.println("Out of range");
//            return getInt(min, max);
//        }
//    }

    public int getInt(int min, int max){
//        int userInput = getInt();
        int userInput = Integer.valueOf(scanner.nextLine());

        if(userInput >= min && userInput <= max){
            return userInput;
        }else {
            System.out.println("Out of range");
            return getInt(min, max);
        }
    }


    public int getInt(){
        try {
            return Integer.valueOf(getString("Enter a number: "));
        }catch(NumberFormatException e) {
            System.out.println("Invalid please try again.");

            return getInt();
        }
    }


    public double getDouble(double min, double max){
        double userInput = getDouble("Give me a decimal: ");
        if(userInput >= min && userInput <= max){
            return userInput;
        }else {
            System.out.println("Out of range");
            return getDouble(min, max);
        }
    }


    public double getDouble(String prompt){
        try {
            return Double.valueOf(getString(prompt));
        }catch(NumberFormatException e) {
            System.out.println("Not a decimal please try again.");
            return getDouble(prompt);
        }
    }



}