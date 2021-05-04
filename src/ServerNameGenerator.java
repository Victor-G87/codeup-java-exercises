import java.util.Arrays;

public class ServerNameGenerator {



    public static void main(String[] args) {
        String[] adj = {"energetic", "evil", "good", "jolly","eager","dull","defeated","dark","clear","alive"};
        System.out.println(Arrays.toString(adj));
        String[] noun = {"data", "art", "law", "nature","fact","area","basis","army","instance","reality"};
        System.out.println(Arrays.toString(noun));

        System.out.println("Server name:\n" + random(adj) + "-" + random(noun));


    }

    public static String random(String[] arrOfStrings) {
        return arrOfStrings[(int)(Math.random() * arrOfStrings.length)];
    }
}
