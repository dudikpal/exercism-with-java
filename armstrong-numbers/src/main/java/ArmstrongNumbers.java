import java.util.Arrays;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        char[] inputNumbers = (numberToCheck + "").toCharArray();
        int resultSum = 0;
        for (char digit: inputNumbers) {
            resultSum += Math.pow(Integer.parseInt(digit + ""), inputNumbers.length);
        }
        return resultSum == numberToCheck ? true : false;
    }
}
