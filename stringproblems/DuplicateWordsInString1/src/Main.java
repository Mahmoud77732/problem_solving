import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        getDuplicateWords(str);
    }
    public static void getDuplicateWords(String str){
        String[] words = str.toLowerCase().split("\\w+");
        Map<String, Integer> countWords = new HashMap<>();
        for(String word : words){
            if(countWords.containsKey(word)){
                countWords.put(word, countWords.get(word)+1);
            }
            else{
                countWords.put(word, 1);
            }
        }
        Set<String> wordsInString = countWords.keySet();
        for(String word : wordsInString){
            if(countWords.get(word) > 1){
                System.out.println(word + " is repeated for " + countWords.get(word) + " times.");
            }
        }
    }
}