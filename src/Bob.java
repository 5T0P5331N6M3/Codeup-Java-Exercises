import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String chatMore = "";
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Hey, what's up? ");
            String userInput = scanner.nextLine();

            String bobQuestion = "Sure.\n";
            String bobExclamation = "Whoa, chill out!\n";
            String bobEmpty = "Fine. Be that way!\n";
            String bobElse = "Whatever.\n";

            if (userInput.endsWith("?")) {
                System.out.print(bobQuestion);
            } else if (userInput.endsWith("!")) {
                System.out.print(bobExclamation);
            } else if (userInput.isEmpty()) {
                System.out.print(bobEmpty);
            } else {
                System.out.print(bobElse);
            }
            System.out.println("Wanna chat with Bob more?");
            chatMore = scanner.next();
        } while (chatMore.equalsIgnoreCase("y") || chatMore.equalsIgnoreCase("yes"));
    }
}
/*
* If a question w/ an ?, then "Sure."
* If yelled at w/ an !, then "Whoa, chill out!"
* If empty input, then "Fine. Be that way!"
* Else, "Whatever."
* */

/* TODO:

    2.  Create a class named Bob with a main method for the following exercise.

        Bob is a lackadaisical teenager. In conversation, his responses are very limited.

                Bob answers 'Sure.' if you ask him a question.
                    (the input ends with a question mark)

                He answers 'Whoa, chill out!' if you yell at him.
                    (the input ends with an exclamation mark)

                He says 'Fine. Be that way!' if you address him without
                actually saying anything.
                    (empty input)

                He answers 'Whatever.' to anything else.

        Write the Java code necessary so that a user of your command line
        application can have a conversation with Bob.

*/