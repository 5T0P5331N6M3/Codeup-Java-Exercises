public class StringExercise {
    public static void main(String[] args) {
        String pinkFloyd = "We don't need no education";
        String pinkFloydChorus = "We don't need no thought control\n";
        System.out.println(pinkFloyd + "\n" + pinkFloydChorus);

        String insideS = "Check \"this\" out!, \"s inside of \"s!\n";
        System.out.println(insideS);

        String windowsMainDrive = "In windows, the main drive is usually C:\\\n";
        System.out.println(windowsMainDrive);

        String backSlashes = "I can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\!";
        System.out.println(backSlashes);
    }
}

/*

    1.  String Basics.

        Create a class named StringExercise with a main method.

        For each of the following output examples: create a String
        variable containing the desired output and print it out to the console;
        you can do this with only one String variable and one print statement
        for each output example.

            We don't need no education
            We don't need no thought control

            Check "this" out!, "s inside of "s!

            In windows, the main drive is usually C:\

            I can do backslashes \, double backslashes \\,
            and the amazing triple backslash \\\!


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
