public class Hamming {

    private int hammingDistance;

    public Hamming(String leftStrand, String rightStrand) {
        strandsValidator(leftStrand, rightStrand);
        hammingDistance = 0;
        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                hammingDistance++;
            }
        }
    }

    public int getHammingDistance() {
        return hammingDistance;
    }

    private void strandsValidator(String leftStrand, String rightStrand) {
        if (leftStrand.equals("") && rightStrand.length() > 0) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        if (rightStrand.equals("") && leftStrand.length() > 0) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }
}
