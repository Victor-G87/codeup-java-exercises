package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        Student jan = new Student("jan");

        Student victor = new Student("victor");

        Student eric = new Student("eric");

        Student sam = new Student("sam");



        jan.addGrade(92);
        jan.addGrade(79);
        jan.addGrade(93);

        victor.addGrade(86);
        victor.addGrade(82);
        victor.addGrade(95);

        eric.addGrade(88);
        eric.addGrade(86);
        eric.addGrade(82);

        sam.addGrade(91);
        sam.addGrade(89);
        sam.addGrade(87);


        HashMap<String, Student> students = new HashMap<>();

        students.put("jj", jan);
        students.put("vic", victor);
        students.put("eer", eric);
        students.put("sos", sam);
        







//       objects Example
//        Create two objects of Main:
//
//        public class Main {
//            int x = 5;
//
//            public static void main(String[] args) {
//                Main myObj1 = new Main();  // Object 1
//                Main myObj2 = new Main();  // Object 2
//                System.out.println(myObj1.x);
//                System.out.println(myObj2.x);
//            }
//        }




    }


}
