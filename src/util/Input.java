package util;
import java.util.Scanner;



public class Input {
    private Scanner scanner;

    public  Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        String response;

        response = scanner.nextLine();

        return response;
    }

    public boolean yesNo() {
        String response;

        response = scanner.nextLine();
        return (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y"));
    }


}
