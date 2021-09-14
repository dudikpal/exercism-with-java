class Proverb {

    private final String[] words;
    private StringBuilder sb;
    private final String[] staticParts = {"For want of a ", " the ", " was lost.\n"};
    private final String[] staticEndParts = {"And all for the want of a ", "."};

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        if (words.length == 0) {
            return "";
        }
        sb = new StringBuilder();
        if (words.length == 1) {
            return endConcat();
        }
        for (int i = 0; i < words.length - 1; i++) {
            lineConcat(words[i], words[i + 1]);
        }
        return endConcat();
    }

    private void lineConcat(String... words) {
        sb.append(staticParts[0]).append(words[0]).append(staticParts[1]).append(words[1]).append(staticParts[2]);
    }

    private String endConcat() {
        sb.append(staticEndParts[0]).append(words[0]).append(staticEndParts[1]);
        return sb.toString();
    }

}
