import java.util.ArrayList;
import java.util.List;

public class PangramChecker {

    public boolean isPangram(String input) {
        char[] inputLetters = input.toLowerCase().toCharArray();
        List<Character> resultLetters = new ArrayList<>();
        for (char letter: inputLetters) {
            if (!resultLetters.contains(letter) && Character.isLetter(letter)) {
                resultLetters.add(letter);
            }
        }
        return resultLetters.size() == 26 ? true : false;
    }
}
