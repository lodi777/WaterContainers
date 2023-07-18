package pl.kurs.service;

import pl.kurs.models.Container;

public class WaterContainerService {

    public static Container findContainerWithHighestWaterLevel(Container[] containers) {
        Container highestContainer = null;
        double maxWaterLevel = 0;

        for (Container container : containers) {
            if (container.getWaterLevel() > maxWaterLevel) {
                maxWaterLevel = container.getWaterLevel();
                highestContainer = container;
            }
        }
        return highestContainer;
    }


}
