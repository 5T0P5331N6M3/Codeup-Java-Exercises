import java.util.Arrays;

public class ArraysExercises
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person[] family = new Person[3];
        family[0] = new Person("Ophelia");
        family[1] = new Person("Amy");
        family[2] = new Person("Hodor");
        for (Person person : family)
        {
            System.out.println(person.getName());
        }

        Person newPerson = new Person("Julian");

        System.out.println(addPerson(family, newPerson).length);

        for (String schmuck : addPerson(family, newPerson))
        {
            System.out.println(schmuck);
        }
    }
    public static String[] addPerson(Person[] person, Person p)
    {
        String[] addPerson = new String[person.length + 1];
        for (int i = 0; i < person.length; i +=1)
        {
            addPerson[i] = person[i].getName();
        }
        addPerson[addPerson.length - 1] = p.getName();
        return addPerson;
    }
}