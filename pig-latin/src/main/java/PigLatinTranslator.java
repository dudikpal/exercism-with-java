/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/

public class PigLatinTranslator {
    String[] vowels = {"a", "e", "i", "o", "u", "xr", "yt"};
    //String[] extraVowels = {"xr", "yt"};

    public String translate(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Empty or null string!");
        }
        str = str.toLowerCase();
        String[] words = str.split(" ");
        String translatedString = "";
        for (String word: words) {
            if (startWithVowel(word)) {
                translatedString += startWithVowelTranslator(word) + " ";
            } else {
                translatedString += startWithConsonantTranslator(word) + " ";
            }
        }
        return translatedString.trim();
    }

    public String startWithConsonantTranslator(String str) {
        str = startOrFollowedByQu(str);
        while (!startWithVowel(str)) {
            str = str.substring(1) + str.charAt(0);
            str = startOrFollowedByQu(str);
            if (str.charAt(0) == 'y') {
                return str + "ay";
            }
        }
        return str.concat("ay");
    }

    private String startOrFollowedByQu(String str) {
        if (str.startsWith("qu")) {
            str = str.substring(2) + str.substring(0, 2);
        }
        return str;
    }

    public String startWithVowelTranslator(String str) {
        return str + "ay";
    }

    private boolean startWithVowel(String str) {
        for (String vowel: vowels) {
            if (str.startsWith(vowel)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PigLatinTranslator plt = new PigLatinTranslator();
        System.out.println(plt.startWithVowel("apple"));
    }
}
