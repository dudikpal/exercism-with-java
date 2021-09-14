class RaindropConverter {

    String convert(int number) {
        boolean isDividable = false;
        String result = "";
        if (number % 3 == 0) {
            result += "Pling";
            isDividable = true;
        }
        if (number % 5 == 0) {
            result += "Plang";
            isDividable = true;
        }
        if (number % 7 == 0) {
            result += "Plong";
            isDividable = true;
        }
        if (isDividable) {
            return result;
        } else {
            return String.valueOf(number);
        }
    }

}
