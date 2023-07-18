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

    public static Container findContainerWithHighestFilled(Container[] containers) {
        Container containerHighestFilled = null;
        double maxFilled = 0;

        for (Container container : containers) {
            double fill = container.getWaterLevel() / container.getMaxCapacity();
            if (fill > maxFilled) {
                maxFilled = fill;
                containerHighestFilled = container;
            }
        }
        return containerHighestFilled;
    }

}
