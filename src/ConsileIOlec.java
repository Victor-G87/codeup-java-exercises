import java.util.Scanner;

public class ConsileIOlec {
    public static void main(String[] args){
        System.out.println("Console IO Lecture");


//        System.out.println("here");
//        System.out.println("there");

//        System.out.print("here");
//        System.out.print("there");

        String firstName = "Douglas";
        String lastName = "Hirsh";
//        System.out.println(firstName + " " +lastName);

        System.out.printf("Hello, %s!\n" , firstName);

        int numberOfPets = 3;
        String typeOfPets = "cats";
        System.out.printf("I have %d %s.\n", numberOfPets, typeOfPets);


        float currencyPennies = 1000.001F;
        System.out.printf("My iPhone cost $%.2f", currencyPennies);

        Scanner sc = new Scanner(System.in);
        System.out.println("what is your first name");
        String userFirstName = sc.next();

        System.out.printf("Nice to meet you , %s",userFirstName);

        System.out.println("How old are you?");
        int age = sc.nextInt();


        System.out.printf("Good to hear you are %d years old.", age);

        System.out.println("Favorite Quote:");
        String favoriteQuote = sc.nextLine();
        System.out.printf(" funny, \"%s\" is my favorite quote too.", favoriteQuote);





    }
}
