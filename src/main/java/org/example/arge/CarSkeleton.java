package org.example.arge;

public class CarSkeleton {

    protected String name;
    protected String description;

    public CarSkeleton(){

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine(){
        System.out.println("engine is starting");
    }

    protected void runEngine(){
        System.out.println("engine is running");
    }

    public void drive(){
        System.out.println("car is driving");
        runEngine();
    }
}
