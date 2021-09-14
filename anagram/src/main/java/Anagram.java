import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    private String word;
    private List<String> realAnagrams = new ArrayList<>();

    public Anagram(String word) {
        this.word = word;
    }

    public List<String> match (List<String> anagrams) {
        for (String anagram: anagrams) {
            if (!word.toLowerCase().equals(anagram.toLowerCase()) && word.length() == anagram.length()) {
                char[] wordArray = word.toLowerCase().toCharArray();
                char[] anagramArray = anagram.toLowerCase().toCharArray();
                Arrays.sort(wordArray);
                Arrays.sort(anagramArray);
                if (Arrays.equals(wordArray, anagramArray)) {
                    realAnagrams.add(anagram);
                }
            }
        }
        return realAnagrams;
    }
}