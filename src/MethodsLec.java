public class MethodsLec {
    public static void main(String[] args) {
        System.out.println("Hello, Methods");
        sayGreeting();
        sayInput("Hello, Class!");
        System.out.println(getGreetingWithName("Marco"));
        System.out.println(returnProductOfThreeNumbers(1,2,3));
        System.out.println(getGreetingWithName("greetings,", "douglas"));
//        countToLoop(100);
        countToLoop(100);

    }
//no inputs and no outputs
    public static void sayGreeting(){
        System.out.println(getDefaultGreeting());
    }

    public static void sayInput(String input){
        System.out.println(input);
    }

//return output without input
    public static String getDefaultGreeting(){
        return "Hello, ";
    }

    //return output with input
    public static String getGreetingWithName(String name){
        return getDefaultGreeting() + " " + name;
    }

    //return output with input using numbers
    public static double returnProductOfThreeNumbers(double num1, double num2, double num3) {
        double result = num1 * num2 * num3;
        return result;
    }

    public static String getGreetingWithName(String salutation, String name) {
        return salutation + name;
    }

    public static void countToLoop(int num) {
        for (int i = 0; i <= num; i++){
            System.out.println(i);
        }
    }

    public static int countTo100(int num){
        System.out.println(num);
        if(num == 100){
            return num;
        } else {
            return countTo100(++num);
        }
    }


}

