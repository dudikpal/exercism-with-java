import java.util.Objects;

class ProductionRemoteControlCar implements RemoteControlCar{

    private int numberOfVictories = 0;

    private int distance = 0;

    @Override
    public void drive() {
        distance += 10;
    }

    @Override
    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductionRemoteControlCar that = (ProductionRemoteControlCar) o;
        return numberOfVictories == that.numberOfVictories;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfVictories);
    }
}
