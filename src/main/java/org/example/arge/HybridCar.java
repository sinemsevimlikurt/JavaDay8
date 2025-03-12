package org.example.arge;

public class HybridCar extends CarSkeleton {
    private int cylinders;
    private double avgKmPerLitre;
    private int batterySize;


    public HybridCar(String name, String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }


    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders(){
        return cylinders;
    }

    @Override
    public void startEngine(){
        System.out.println(getClass().getSimpleName() + " engine is starting");
    }

    @Override
    public void drive(){
        System.out.println(getClass().getSimpleName() + " car is driving");
        runEngine();
    }
}
