import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    private List<String> proteins = new ArrayList<>();

    List<String> translate(String rnaSequence) {
        for (int i = 0; i < rnaSequence.length(); i+=3) {
            String codon = rnaSequence.substring(i, i + 3);
            if (isStopCodon(codon)) {
                return proteins;
            }
            proteins.add(codonToProtein(codon));
        }
        return proteins;
    }

    private String codonToProtein(String codon) {
        switch (codon) {
            case "AUG": return "Methionine";
            case "UUU":
            case "UUC": return "Phenylalanine";
            case "UUA":
            case "UUG": return "Leucine";
            case "UCU":
            case "UCC":
            case "UCA":
            case "UCG": return "Serine";
            case "UAU":
            case "UAC": return "Tyrosine";
            case "UGU":
            case "UGC": return "Cysteine";
            case "UGG": return "Tryptophan";
            default: throw new IllegalArgumentException("The string is not codon!");
        }
    }

    private boolean isStopCodon(String codon) {
        if (codon.equals("UAA") || codon.equals("UAG") || codon.equals("UGA")) {
            return true;
        }
        return false;
    }
}
