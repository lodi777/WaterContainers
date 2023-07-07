package pl.kurs.models;

public class Container {

    private String name;
    private double maxCapacity;
    private double waterLevel;

    private Container(String name, double maxCapacity, double waterLevel) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.waterLevel = waterLevel;
    }


    public static Container create(String name, double maxCapacity, double waterLevel) {
        if (maxCapacity <= 0) {
            throw new RuntimeException("Maksymalna pojemność musi być większa niż 0!");
        }
        if (waterLevel < 0) {
            throw new RuntimeException("Pojemność nie może być poniżej zera!");
        }
        if (waterLevel >= maxCapacity) {
            throw new RuntimeException("Woda nie może przekroczyć maksymalnego poziomu zbiornika!");
        }
        return new Container(name, maxCapacity, waterLevel);
    }
}
