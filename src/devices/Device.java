package devices;

import creatures.Human;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public abstract class Device {
    public String producer;
    public String model;
    public Integer yearOfProduction;
    public Double garagePrice;
    public Car car;
    public Human human;


    public String toString() {

        return producer + " " + model + " " + yearOfProduction;
    }

    public abstract boolean turnOn();


}