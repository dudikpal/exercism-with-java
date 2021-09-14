import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        
        StringBuilder binaryString = new StringBuilder(Integer.toBinaryString(number));
        boolean isReverseFlag = false;

        if (binaryString.length() > 5) {

            binaryString = new StringBuilder(binaryString.substring(binaryString.length() - 5));
        }

        if (binaryString.length() == 5) {
            isReverseFlag = true;
            binaryString.deleteCharAt(0);
        }

        binaryString.reverse();
        int strLength = binaryString.length();
        List<Signal> signals = new ArrayList<>();
        
        for (int i = 0; i < strLength; i++) {
            if (binaryString.charAt(i) == '1') {
                signals.add(Signal.values()[i]);
            }
        }
        
        if (isReverseFlag) {
            Collections.reverse(signals);
        }
        
        return signals;
    }
}
