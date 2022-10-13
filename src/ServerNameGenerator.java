import java.util.Random;

public class ServerNameGenerator
{
    public static void main(String[] args)
    {
     String[] adjectives = new String[10];
        adjectives[0] = "ugly";
        adjectives[1] = "sweet";
        adjectives[2] = "tall";
        adjectives[3] = "short";
        adjectives[4] = "mal";
        adjectives[5] = "beautiful";
        adjectives[6] = "sleeveless";
        adjectives[7] = "meaningless";
        adjectives[8] = "nicer";
        adjectives[9] = "uglier";

     String[] noun = new String[10];
        noun[0] = "Jim";
        noun[1] = "Bob";
        noun[2] = "Cas";
        noun[3] = "Joe";
        noun[4] = "Tom";
        noun[5] = "Phe";
        noun[6] = "Mac";
        noun[7] = "Cho";
        noun[8] = "Amida";
        noun[9] = "Julian";
        System.out.println("Here is your server name: \n" + randomElement(adjectives, noun));
    }
    public static String randomElement(String[] adjectives, String[] noun)
    {
        int randomNumA = 0;
        int randomNumB = 0;
        Random random = new Random();
        randomNumA = random.nextInt(9);
        randomNumB = random.nextInt(9);
        return adjectives[randomNumA] + "-" + noun[randomNumB];
    }
}
