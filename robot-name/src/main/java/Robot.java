import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class Robot {

    private String name;

    private static Set<String> names = new HashSet<>();

    public Robot() {
        this.name = createName();
    }


    private String createName() {

        Random rnd = new Random();
        StringBuilder sb;

        do {

            sb = new StringBuilder();

            for (int i = 0; i < 5; i++) {

                if (i < 2) {

                    sb.append(getRandomLetter(rnd));
                } else {

                    sb.append(getRandomNumber(rnd));
                }
            }
        } while (!isUnique(sb.toString()));

        names.add(sb.toString());

        return sb.toString();
    }


    public void reset() {

        name = createName();
    }


    private boolean isUnique(String name) {

        return !names.contains(name);
    }


    private String getRandomNumber(Random rnd) {

        return String.valueOf(rnd.nextInt(10));
    }


    private String getRandomLetter(Random rnd) {

        return Character.toString(rnd.nextInt(26) + 65);
    }


    public String getName() {

        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}