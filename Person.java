

import java.util.HashMap;
import java.util.Hashtable;

public class Person
{
    String name;
    HashMap<Person,Boolean> persons;
    Hashtable<Person,Boolean> friendList;


    public Person(String s)
    {
        this.name = s;
        persons= new HashMap<>();
        friendList = new Hashtable<>();
    }
}
