import creatures.Animal;
import creatures.Human;
import cars.Diesel;
import cars.Electric;
import cars.Lpg;
import devices.Application;
import devices.Car;
import devices.Device;
import devices.Phone;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Animal animal = new Animal();
//        {
//
//            @Override
//        public void feed(Double foodWeight) {
//        }
//    };


//        animal.feed();
//        animal.takeForAWalk();
        /**    animal.takeForAWalk();
         animal.takeForAWalk();
         animal.feed();
         animal.feed();
         animal.feed(); */
        Animal animal = new Animal() {
            @Override
            public void feed(Double foodWeight) {

            }
        };


        Car bmw = new Lpg();
        bmw.model = "m2";
        bmw.producer = "Bmw zdunek";
        bmw.colour = "space grey";
        bmw.price = 2000.0;
        bmw.typee = "suv";
        bmw.yearOfProduction = 2011;


        Car audi = new Diesel();
        audi.model = "q8";
        audi.producer = "Audi corp";
        audi.colour = "black";
        audi.price = 3045.0;
        audi.typee = "sedan";


        Car tesla = new Electric();
        tesla.model = "x2 ";
        tesla.producer = "tesla";
        tesla.colour = "white";
        tesla.price = 405.5;
        tesla.typee = "sport";
        tesla.yearOfProduction = 2015;

        List<Double> listPriceCarGarage = new ArrayList<Double>();
        listPriceCarGarage.add(tesla.price);
        listPriceCarGarage.add(audi.price);

        List<Integer> listCarYear = new ArrayList<Integer>();
        listCarYear.add(tesla.yearOfProduction);
        listCarYear.add(bmw.yearOfProduction);


        Human human = new Human(3);
        human.setCar(bmw, 1);
        human.setNewCar(bmw, 1);
        human.sumCarPrice(listPriceCarGarage);
        human.sortCarByYear(listCarYear);
        tesla.wasOwner(human);




        Phone phone = new Phone();
        phone.setModel("hujawei");
        System.out.println(human.toString());
        System.out.println(bmw.toString());
        phone.installAnnApp(human, 2, "Mario");
        Application app = new Application("free game", 0);
        phone.isItFreeApp(app);
        phone.showAllApp();
        phone.showAllAppNameSortByPrice();
        phone.isItInstalled("Mario");


        Human buyer = new Human();
        buyer.setSalary(0.0);
        buyer.setCash(500);
        Human seller = new Human(1);
        tesla.hasSold(seller,human);

       seller.setPhone(phone);
       seller.setPet(animal);
       seller.setCar(bmw,1);
        seller.setSalary(10000.0);
       animal.salleable.sell(seller, buyer, 3000.0);
        bmw.salleable.sell(seller, buyer, 2000.0);
        phone.salleable.sell(seller, buyer, 7000.0);
        System.out.println("fundusze sprzedawcy przed " + seller.getCash());
       System.out.println("fundusze nabywcy przed  " + buyer.getCash());
       System.out.println(" Data " + ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));

    }
}
