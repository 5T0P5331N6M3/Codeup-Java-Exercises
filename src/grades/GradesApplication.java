package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication 
{
    public static void main(String[] args) 
    {
        HashMap<String, Student> students = new HashMap<>();
        Student cas = new Student("Cas");
        Student phe = new Student("Phe");

        cas.addGrade(90);
        cas.addGrade(50);
        cas.addGrade(90);

        phe.addGrade(100);
        phe.addGrade(99);
        phe.addGrade(99);
        phe.addGrade(100);

        students.put("casanova", cas);
        students.put("pheester", phe);

        cli(students);
    }

    public static void cli(HashMap<String,Student> students){
        Input input = new Input();
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");

        for (String ghUsername : students.keySet()) {
            System.out.print(ghUsername+" ");
        }

        do {

            System.out.println();
            System.out.println("What student would you like to see more information on?");
            String keyTyped = input.getString(); //Not sure what I'm missing here.

            if (students.containsKey(keyTyped)) {
                System.out.printf("Name: %s - GitHub Username: %s\n" +
                                "Current Average: %f\n",
                        students.get(keyTyped).getName(),
                        keyTyped,
                        students.get(keyTyped).getGradeAverage());
            } else {
                System.err.println("Sorry, no student found with the GitHub keyTyped of " + keyTyped);
            }
        } while (input.yesNo("Would you like to see another student? Y/N"));

        System.out.println("Goodbye, and have a wonderful day!");

    }
}

