import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person[] people = new Person[3]; // array of person objects
        people[0] = new Person("mono");
        people[1] = new Person("mike");
        people[2] = new Person("Matt");

        people = addPerson(people, new Person("mars"));

        for(Person person : people) {
            System.out.println(person.getName());
        }


    }

    public static Person[] addPerson(Person[] arrayOfPersons,Person person ){
        Person[] newArray = Arrays.copyOf(arrayOfPersons, arrayOfPersons.length + 1);
        newArray[arrayOfPersons.length] = person;
        return newArray;
    }




}
