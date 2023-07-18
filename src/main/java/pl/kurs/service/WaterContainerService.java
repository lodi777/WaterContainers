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

    public static Container[] findEmptyContainers(Container[] containers) {
        int valueEmptyContainers = 0;

        for (Container container : containers) {
            if (container.getWaterLevel() == 0) {
                valueEmptyContainers++;
            }
        }
        Container[] emptyContainers = new Container[valueEmptyContainers];
        int index = 0;

        for (Container container : containers) {
            if (container.getWaterLevel() == 0) {
                emptyContainers[index++] = container;
            }
        }
        return emptyContainers;
    }

}
