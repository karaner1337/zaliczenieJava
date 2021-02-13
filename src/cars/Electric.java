package cars;


import devices.Car;

public class Electric extends Car {
    @Override
    public String refuel() {
        return "ladowanie baterii ";
    }
}

