class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class
    private int speed;
    private int batteryDrain;
    private int battery = 100;
    private int distance = 0;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (!batteryDrained()) {
            distance += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
    private int trackDistance;

    public RaceTrack(int trackDistance) {
        this.trackDistance = trackDistance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
        }

        return trackDistance <= car.distanceDriven();
    }
}
