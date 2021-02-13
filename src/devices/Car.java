package devices;

import creatures.Human;
import creatures.Salleable;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device {
    public String colour;
    public Double price;
    public String model;
    public String producer;
    public String typee;
    public List<Human> ownerList = new ArrayList<>();
    public List<CarTransaction> transactionList = new ArrayList<>();


    public abstract String refuel();

    public String toString() {
        return producer + " " + model + " " + colour + " " + price + " " + typee;
    }

    @Override

    public boolean turnOn() {
        System.out.println("ON");
        return true;
    }
    public Human lastOwner(){
        return this.transactionList.get(this.transactionList.size() - 1).buyer;
    }
    public Boolean wasOwner(Human questionedHuman){
        return this.transactionList.stream().map(CarTransaction::getBuyer).anyMatch(questionedHuman::equals);
    }
    public Boolean hasSold(Human A, Human B){
        for (CarTransaction transaction : this.transactionList) {
            try{
                if(transaction.seller == A & transaction.buyer == B){
                    System.out.println("Sprzedajacy"+A+"sprzedał auto"+B+"Kupił auto");
                    return true;
                }
            } catch (NullPointerException e){
                System.out.println("Barak wymiany miedzy"+A+B);
                continue;
            }
        }
        return false;
    }

    public Salleable salleable = new Salleable() {
        @Override
        public void sell(Human seller, Human buyer, Double price) {

            for (Integer i = 0; i < seller.garage.length; i++) {
                if (seller == lastOwner()) {

                if (car == seller.garage[i]) {
                    if (buyer.getSalary() >= price) {
                        for (Integer j = 0; j < buyer.garage.length; j++) {
                            if (null == buyer.garage[j]) {
                                buyer.salary -= price;
                                seller.salary += price;
                                buyer.setCar(car, j);
                                seller.setCar(null, i);
                                System.out.println("Sukces kupiłeś auto");
                            } else {
                                System.out.println("Nie masz juz miejsca w garżu zwolnij tempo!");
                            }
                        }
                    } else {
                        System.out.println("Nie masz wystarczajacej ilości kasy");
                    }

                } else {
                    System.out.println("brak auta w garazu sprzedjacego ");
                }
            }else {
                    System.out.println("Auto jest kradzione!!!");

                }

            }


        }


    };


}