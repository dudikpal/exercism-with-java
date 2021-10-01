class SqueakyClean {

    static String clean(String identifier) {

        StringBuilder sb = new StringBuilder();
        boolean upperNext = false;

        for (char letter : identifier.toCharArray()) {
            if (letter == ' ') {
                sb.append("_");
            } else if (letter < 13) {
                sb.append("CTRL");
            } else if (letter >= 'α' && letter <= 'ω') {
                continue;
            } else if (letter == '-') {
                upperNext = true;
            } else if (upperNext) {
                sb.append(Character.toUpperCase(letter));
                upperNext = false;
            } else if (Character.isLetter(letter)) {
                sb.append(letter);
            }
        }
        return sb.toString();
    }
}
