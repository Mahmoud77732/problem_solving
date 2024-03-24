import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String subStr = sc.nextLine();
        getSubStringCount(sentence, subStr);

    }

    public static void getSubStringCount(String sentence, String subStr){
        int index = 0, count = 0;
        while((index = sentence.indexOf(subStr, index)) != -1){
            count++;
            index += subStr.length();
        }
        System.out.println(count);
    }
}