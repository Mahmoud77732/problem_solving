import java.util.Scanner;
import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        getWordsCountBySplit(sentence);
        getWordsCountByTokinizer(sentence);
    }

    public static void getWordsCountBySplit(String sentence){
        // Removing leading and trailing whitespaces
        sentence = sentence.trim();
        /*
        Basically, \\s helps us to match for the single whitespace character whereas,
        \\s+ helps us to match the sequence of more than one whitespace character
        */
        String[] words = sentence.toLowerCase().split("\\s+");
        System.out.println(words.length);
    }

    public static void getWordsCountByTokinizer(String sentence){
        StringTokenizer strTokinizer = new StringTokenizer(sentence);
        System.out.println(strTokinizer.countTokens());
    }

}