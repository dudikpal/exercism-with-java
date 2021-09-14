class RnaTranscription {

    String transcribe(String dnaStrand) {
        char[] dnaArray = dnaStrand.toCharArray();
        String rna = "";
        for (char letter: dnaArray) {
            rna += dnaToRna(letter);
        }
        return rna;
    }

    private char dnaToRna(char letter) {
        return switch (letter) {
            case 'G' -> 'C';
            case 'C' -> 'G';
            case 'T' -> 'A';
            case 'A' -> 'U';
            default -> Character.MIN_VALUE;
        };
    }
}
