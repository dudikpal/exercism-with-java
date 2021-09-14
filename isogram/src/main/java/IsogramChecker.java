import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        List<Character> letters = new ArrayList<>();
        phrase = phrase.replace("-", "").replace(" ", "");
        for (char letter: phrase.toLowerCase().toCharArray()) {
            if (letters.contains(letter)) {
                return false;
            } else {
                letters.add(letter);
            }
        }
        return true;
    }

}
