import java.util.Arrays;

class ResistorColor {

    enum resistors {
        black,
        brown,
        red,
        orange,
        yellow,
        green,
        blue,
        violet,
        grey,
        white
    }

    int colorCode(String color) {
        return resistors.valueOf(color).ordinal();
    }

    String[] colors() {
        return Arrays.stream(resistors.values())
                .map(resistors::name)
                .toArray(String[]::new);
    }
}
