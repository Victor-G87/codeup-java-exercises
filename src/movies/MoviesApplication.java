package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input userInput = new Input();

        boolean repeat = true;
        do {
            System.out.println("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n");

            String choice = userInput.getString("Enter your choice: ");

            switch (choice) {
                case "0":
                    System.out.println("Ok, See you next time!");
                    repeat = false;
                    break;
                case "1":
                    for (Movie movie : MoviesArray.findAll()) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    break;
                case "2":
                    for (Movie movie : MoviesArray.findAll()) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case "3":
                    for (Movie movie : MoviesArray.findAll()) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case "4":
                    for (Movie movie : MoviesArray.findAll()) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case "5":
                    for (Movie movie : MoviesArray.findAll()) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                default:
                    break;
            }
        }while(repeat);

    }
}