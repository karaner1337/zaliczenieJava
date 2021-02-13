package creatures;

import devices.Car;
import devices.Phone;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Human {
    public String name;
    Animal pet;
    public devices.Car garage[];
    public Double salary = 2545.0;
    private Double inflacja = 1.19;
    Integer garageSize;



    Double cash = 0.0;
    Phone phone;

    public Human() {
    }

    public Human(String name, Animal pet, Car[] garage, Double salary, Double inflacja, Double cash, Phone phone) {
        this.name = name;
        this.pet = pet;
        this.garage = new Car[5];
        this.salary = salary;
        this.inflacja = inflacja;
        this.cash = cash;
        this.phone = phone;
    }

    public  void sumCarPrice(List<Double> tablePriceCarInGarage) {
       double sum = tablePriceCarInGarage.stream().mapToDouble(Double::intValue).sum();// rozwiazanie stream dzięki tej stronie https://stackoverflow.com/questions/5963847/is-there-possibility-of-sum-of-arraylist-without-looping
        System.out.println("suma ceny aut w grazau:" + sum);
    }

    public void sortCarByYear(List<Integer> listCarYear){

        Collections.sort(listCarYear, Collections.reverseOrder());
    }




    public Human(int garageSize) {
        this.garage = new Car[garageSize];
    }


    public String toString() {
        return salary + " " + name;
    }

    public void setCar(Car car, int parkingSpaceNumber) {


        this.garage[parkingSpaceNumber] = car;
    }

    public void setGarage(Car[] garage) {
        this.garage = garage;
    }

    public Car getCar(int parkingSpaceNumber) {

         return this.garage[parkingSpaceNumber+1];
    }


    public Double getSalary() {
        System.out.println(" Data " + ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME) + " Siano " + salary);
        return salary;
    }

    public Double setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("hajs musi byc na +");
        } else {
            System.out.println("wypisuje informacje o tym, że nowe dane zostały wysłane do systemu księgowego ");
            System.out.println("wypisuje informację o konieczności odebrania aneksu do umowy od pani Hani z kadr");
            System.out.println("wypisuje info, że ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu ");
            return this.salary = salary;
        }
        return this.salary = salary;
    }

    public void setNewCar(Car car, int parkingSpaceNumber) {
        if (salary >= car.price) {
            System.out.println("auto zalatwione");
            getCar(parkingSpaceNumber);
        } else if (salary > (car.price / 12)) {
            System.out.println("kredyt jedyna opcja");
            getCar(parkingSpaceNumber);
        } else {
            System.out.println("nie stac cie ");
        }
    }

    public double getCash() {
        return cash + salary;
    }

    public void setCash(double cash) {
        this.cash = this.cash + cash;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
