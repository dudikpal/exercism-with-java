import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> cars = new ArrayList<>();
        cars.add(prc1);
        cars.add(prc2);

        return cars.stream()
                .sorted(Comparator.comparing(ProductionRemoteControlCar::getNumberOfVictories))
                .collect(Collectors.toList());
    }
}
