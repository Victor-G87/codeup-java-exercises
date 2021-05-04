import util.Input;

public class InputTest {
    public static void main(String[] args){
        Input userInput = new Input();
        System.out.println(userInput.getString("Enter a string"));
        System.out.println("type yes or no");
        System.out.println(userInput.yesNo());
        System.out.println(userInput.getInt(1, 10));
        System.out.println(userInput.getInt());
        System.out.println(userInput.getDouble(1, 10));
        System.out.println(userInput.getDouble("Give me a decimal: "));

    }
}