import java.util.ArrayList;
import java.util.List;

public class Lasagna {

    int EXPECTED_MINUTES_IN_OVEN = 40;

    int MINUTES_PREPARING_PER_LAYER = 2;


    public int expectedMinutesInOven()
    {
        return EXPECTED_MINUTES_IN_OVEN;
    }


    public int remainingMinutesInOven(int actualInTheOven)
    {
        return EXPECTED_MINUTES_IN_OVEN - actualInTheOven;
    }


    public int preparationTimeInMinutes(int numberOfLayer)
    {
        return numberOfLayer * MINUTES_PREPARING_PER_LAYER;
    }


    public int totalTimeInMinutes(int layers, int actualInTheOven)
    {
        List<String> s = new ArrayList<>();
        return preparationTimeInMinutes(layers) + actualInTheOven;
    }
}
