import java.util.*;

class Scrabble {
    
    private String word;
    private int score;
    private static Map<Integer, List<Character>> values;
    
    static{
        values = new HashMap<>(){{
            put(1, List.of('A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'));
            put(2, List.of('D', 'G'));
            put(3, List.of('B', 'C', 'M', 'P'));
            put(4, List.of('F', 'H', 'V', 'W', 'Y'));
            put(5, List.of('K'));
            put(8, List.of('J', 'X'));
            put(10, List.of('Q', 'Z'));
        }};
    }
    
    
    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    
    public int getScore() {
        score = 0;
        for (char letter : word.toCharArray()) {
            letterValue(letter);
        }
        return score;
    }
    
    
    private void letterValue(char letter) {
        for (int value : values.keySet()) {
            if (values.get(value).contains(letter)) {
                score += value;
            }
        }
    }
    
    

}
