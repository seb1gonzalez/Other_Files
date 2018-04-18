import java.util.Scanner;
public class mainFacebook
{
    public static void main(String[]args)
    {
        Person person;
        System.out.println("Press enter to begin");
        Scanner input = new Scanner(System.in);
       String command = input.nextLine();

        while(command != "x") {
            System.out.println("Type a command, P creates a new person, F adds a friend to a person, U unfriends a person");
            System.out.println("L shows a person's friend list, Q determines if a person has a specific friend, X terminates the program");
             command = input.nextLine();
            command.toLowerCase();
            switch (command) {
                case "p":
                    String a;
                    System.out.println("Creating new person");
                    System.out.println("What is the person's name?");
                    a = input.nextLine();
                    person = new Person(a);
                    person.persons.put(person,true);
                    break;
                case "f":
                    String b,c;
                    System.out.println("Which friends do you want to add?");
                    b = input.nextLine();
                    c = input.nextLine();
                    person.friendList.put(person.name,null);

                    person.friendList.put(person,true);
                    person.friendList.put(person,true);


                    break;
                case "u":
                    String d,e;
                    System.out.println("Which persons are you going to unfriend?");
                    d=input.nextLine();
                    e=input.nextLine();



                    break;
                case "l":
                    System.out.println("Whose friends do you want to see?");
                    String f;
                    f= input.nextLine();
                    person1 = new Person(f);
                    System.out.println(person1.friendList.toString());


                    break;
                case "q":
                    String g,h;
                    System.out.println("Type in person 1");
                    g = input.nextLine();
                    System.out.println("Type in person 2");
                    h = input.nextLine();


                    break;
            }
        }

    }
}
