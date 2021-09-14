import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    private final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private List<String> lines = new ArrayList<>();
    private StringBuilder sb;

    List<String> printToList(char a) {
        sb = new StringBuilder();
        int startIndex = letters.indexOf(a);
        if (startIndex == 0) {
            lines.add(a + "");
            return lines;
        }
        generateDiamond(startIndex);
        return lines;
    }

    private void generateDiamond(int startIndex) {
        for (int i = 0; i < startIndex + 1; i++) {
            sb.setLength(0);
            spaceGenerator(startIndex + 1);
            sb.setCharAt(i, letters.charAt(i));
            sb.reverse();
            sb.append(new StringBuilder(sb.subSequence(0, startIndex)).reverse());
            lines.add(sb.toString());
        }
        for (int i = startIndex - 1; i >= 0; i--) {
            lines.add(lines.get(i));
        }
    }

    private String spaceGenerator(int numberOfSpaces) {
        for (int i = 0; i < numberOfSpaces; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }
}
