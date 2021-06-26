import com.section06.models.CarInfo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // set add pattern
        CarInfo carInfo = CarInfo.newBuilder()
                .putCars(2017, "CX-5")
                .putCars(2018, "Harrier")
                .build();

        // set add all pattern
        Map<Integer, String> carMap = new HashMap<>();
        carMap.put(2019, "Crown");
        carMap.put(2020, "Vezel");

        CarInfo carInfo2 = CarInfo.newBuilder()
                .putAllCars(carMap)
                .build();

        // get select key pattern
        String car_2020 = carInfo.getCarsOrThrow(2017);

        // get loop pattern
        for(Integer key : carInfo.getCarsMap().keySet()) {
            System.out.println("key=" + key + " value=" + carInfo.getCarsMap().get(key));
        }
    }
}
