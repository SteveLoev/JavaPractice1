package task._done.Person1;

public class Main {

    public static void main(String[] args) {

        Person2 p = new Person2();
        p.setName("Mike");
        p.setAge(30);

        System.out.println("Name: "+ p.getName());
        System.out.println("Age: "+ p.getAge());


        /*
        Scanner in = new Scanner(System.in);

        Person person = new Person();

        System.out.println(person.getFirstName());
        System.out.println(person.getAge());

        person.setAge(in.nextInt());
        System.out.println(person.getAge());

        Person person2 = new Person(in.next(), in.next(), in.nextInt());
        System.out.println(person2.getLastName());
        System.out.println(person2.toString());

         */
    }
}
