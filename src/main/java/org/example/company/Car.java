package org.example.company;

import java.util.Objects;

public class Car {

    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return engine == car.engine && getCylinders() == car.getCylinders() && wheels == car.wheels && Objects.equals(getName(), car.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, getCylinders(), getName(), wheels);
    }

    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate(){
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake(){
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }

}
