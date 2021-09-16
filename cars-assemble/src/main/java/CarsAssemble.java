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
        switch(speed)
        {
            case 1:
            case 2:
            case 3:
            case 4: return 1;
            case 5:
            case 6:
            case 7:
            case 8: return 0.9;
            case 9: return 0.8;
            case 10: return 0.77;
            default: return 0;
        }

    }


    public static void main(String[] args) {
        CarsAssemble c = new CarsAssemble();
        System.out.println(c.workingItemsPerMinute(4));
    }
}
