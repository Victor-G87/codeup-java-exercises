public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello() {
        return String.format("Hello, my name is %s!", name);
    }

    public static void main(String[] args) {
        Person me = new Person("Victor");
        String newName = "Mono";

        System.out.printf("%s\n", me.getName());
        System.out.printf("Setting name to %s...\n", newName);
        me.setName(newName);
        System.out.printf("%s\n", me.sayHello());


        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }
}