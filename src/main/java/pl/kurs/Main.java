package pl.kurs;

import pl.kurs.models.Container;
import pl.kurs.service.WaterContainerService;

public class Main {
    public static void main(String[] args) {
        Container container1 = Container.create("Zbiornik 1", 150, 90);
        Container container2 = Container.create("Zbiornik 2", 100, 80);
        Container container3 = Container.create("Zbiornik 3", 100, 0);
        Container container4 = Container.create("Zbiornik 4", 100, 0);
        Container container5 = Container.create("Zbiornik 5", 100, 50);

        Container[] containers = {container1, container2, container3, container4, container5};

        Container containerWithHighestWaterLevel = WaterContainerService.findContainerWithHighestWaterLevel(containers);
        System.out.println(containerWithHighestWaterLevel);

        Container containerHighestFilled = WaterContainerService.findContainerWithHighestFilled(containers);
        System.out.println(containerHighestFilled);

        Container[] emptyContainers = WaterContainerService.findEmptyContainers(containers);
        System.out.println("Puste zbiorniki: ");
        for (Container container : emptyContainers) {
            System.out.println(container.getName());
        }



    }
}