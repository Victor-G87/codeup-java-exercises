import java.util.Scanner;  // Import the Scanner class

public class ControlFlowExercises {
    public static void main(String[] args) {


//        int i = 5;
//        while (i <= 15){
//            System.out.println("i is " + i);
//            i++;
//        }


//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        }
//        while (i >= -10);


//        long i = 2;
//        do {
//            System.out.println(i);
//            i*=i;
//        }
//        while (i < 100000);
//
//

//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }


//        for (long i = 2; i < 1000000; i*=i) {
//            System.out.println(i);
//        }


//        for (int i = 1; i <= 100; i++) {
//
//            if (i % 5 == 0) {
//                System.out.println("BuZZ!");
//            }
//            if (i % 3 == 0) {
//                System.out.println("Fizz!");
//            }
//            if (i % 3 == 0 & i % 5 == 0) {
//                System.out.println("FizzBuzz!");
//            } else {
//                System.out.println(i);
//            }
//
//        }
//
//    }


        for (int i = 1; i <= 100; i++) {
            if (((i % 3) == 0) & ((i % 5) == 0))
                System.out.println("fizzbuzz");
            else if ((i % 3) == 0) //
                System.out.println("fizz");
            else if ((i % 5) == 0)
                System.out.println("buzz");
            else
                System.out.println(i);
        }

    }



//                //construct a scanner object
//        Scanner sc = new Scanner(System.in);
//        int startValue = 1;
////        get input from the user
//            System.out.print("Enter Number:\t\t");
//            double score = sc.nextDouble();
//
//        for (int row =0; row < 5; row++)
//        {
//            int y =1;
//
//            for (int col = startValue; col < startValue+6; col ++)
//            {
//
//                y = y *startValue;
//                System.out.print(y + " " );
//            }
//
//            System.out.println();
//            startValue++;
//        }


//        Scanner in = new Scanner(System.in);
//        System.out.println("Input the Number: ");
//        int n = in .nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n + "*" + i + " = " + (n * i));
//        }


//        System.out.println("Welcome to the Squares and Cubes Table");
//        System.out.println();
//
//        Scanner sc = new Scanner(System.in);
//        String choice = "y";
//
//        while(choice.equalsIgnoreCase("y"))
//        {
//            // get the input from the user
//            System.out.println("Enter an Integer: ");
//            int integerNext = sc.nextInt();
//
//            System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
//            System.out.println("======" + "  " + "======" + "  " + "======");
//
//            for (int i = 1; i <= integerNext; i++) {
//                int numberSquared = (int) Math.pow(i, 2);
//                int numberCubed = (int) Math.pow(i, 3);
//
//                String message = "\n" + i + "       " + numberSquared + "       " + numberCubed;
//
//                System.out.print(message);
//            }
//
//// see if the user wants to continue
//            System.out.print("\nContinue? (y/n): ");
//            choice = sc.next();
//            System.out.println();
//            }








//        //welcome the user
//        System.out.println("Grades");
//
//
//        //construct a scanner object
//        Scanner sc = new Scanner(System.in);
//
//        //perform conversions until choice is value other than "y" or "Y"
//        String choice = "y";
//        while (choice.equalsIgnoreCase("y"))
//        {
//            //get input from the user
//            System.out.print("Enter Numeric Grade:\t\t");
//            double score = sc.nextDouble();
//
//            //convert user numeric grade into letter grade
//            char userGrade = 'F';
//            if(score >= 88)
//                userGrade = 'A';
//            else if(score >= 80)
//                userGrade = 'B';
//            else if (score >= 67)
//                userGrade = 'C';
//            else if (score >= 60)
//                userGrade = 'D';
//
//            // display conversion result
//            String message = "Equivalent Letter Grade:\t" + userGrade;
//            System.out.println(message);
//
//            //see if user wants to continue
//            System.out.print("\nContinue? (y/n):\t\t");
//            choice = sc.next();
//            System.out.println();
//        }//end while loop
//    }//end main()
//} //end class GradeConverter













    }

//}