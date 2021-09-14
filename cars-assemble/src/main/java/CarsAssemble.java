public class CarsAssemble {

    private static int productPerHour = 221;

    public double productionRatePerHour(int speed) {
        return productPerHour * speed * successRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed) / 60;
    }


    private static double successRate(int speed)
    {
        double result = switch(speed)
        {
            case 1, 2, 3, 4 -> 1;
            case 5, 6, 7, 8 -> 0.9;
            case 9 -> 0.8;
            case 10 -> 0.77;
            default -> 0;
        };
        return result;
    }
}
