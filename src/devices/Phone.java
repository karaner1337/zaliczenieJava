package devices;

import creatures.Human;
import creatures.Salleable;
import devices.Application;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.net.URL;
import java.util.stream.Collectors;

public class Phone extends Device{

    public String model;
    public static final String appName = "Greatapp";
    public static final String version = "alfa";
    public static final String serverAddress = "456453";
    public List<String> appList;
    public List<Application> appListObject;
    public List<Application> freeAppList;

    public URL url;

    @Override

    public boolean turnOn() {
        System.out.println("ON");
        return true;
    }

    public Salleable salleable = new Salleable() {

        @Override

        public void sell(Human seller, Human buyer, Double price) {
            if(buyer.getCash()>=price) {
                if (seller.getPhone() == null) {
                    System.out.println("smartpgone not found");
                } else {
                    System.out.println("smartphone found");
                }
            }else {
                System.out.println("piniadz not found");
            }


        }

    };
    public String getModel() {
        return model;
    }


    public String installAnnApp(Human phoneOwner,double appPrice,String appNam) {
        if(phoneOwner.salary>=appPrice){
            appList.add(appName);
            phoneOwner.salary=phoneOwner.salary-appPrice;
        }else{
            System.out.println("nie masz pieniedzy na ta aplikacje");
        }

        return appName;
    }
    public String installAnnApp(Human phoneOwner,double appPrice,Application application) {
        if(phoneOwner.salary>=appPrice){
            appListObject.add(application);
            phoneOwner.salary=phoneOwner.salary-appPrice;
        }else{
            System.out.println("nie masz pieniedzy na ta aplikacje");
        }

        return appName;
    }

    public boolean isItInstalled(String appname){
        if(appList.contains(appname)){
            System.out.println("Aplikacja jest zainstalowana ");
            return true;
       }else {
           System.out.println("Nie ma takiej aplikacji zainstalowanej");
            return false;
        }

    }
    public boolean isItInstalled(Application application){
        if(appListObject.contains(application)){
            System.out.println("Aplikacja jest zainstalowana ");
            return true;
        }else {
            System.out.println("Nie ma takiej aplikacji zainstalowanej");
            return false;
        }

    }

    public boolean isItFreeApp(Application application){
        if(application.getAppPrice()==0){
            System.out.println("Aplikacja jest darmowa");
            freeAppList.add(application);
            return true;
        }else {
            System.out.println("To nie jest darmowa aplikacja");
            return false;
        }
    }

    public void  showAllApp(){
        appListObject.forEach(System.out::println);
    }

    public void  showAllAppNameSortByPrice(){
        Collections.sort(appList);
        appList.forEach(System.out::println);
    }

    public void sortAppNameByPrice(List<Application> appListObject){
       appListObject.stream().sorted(Comparator.comparing(Application::getAppPrice)).collect(Collectors.toList());//rozwiazanie dzieki https://dev.to/codebyamir/sort-a-list-of-objects-by-field-in-java-3coj
    }


    public String installAnnApp(String appName, String version) {

        return appName + version;
    }

    public String installAnnApp(String appName, String version, String serverAddress) {

        return appName + version + serverAddress;
    }

    public String installAnnApp(List<String> appList) {

        return appList.toString();
    }

    public String installAnnApp(URL url) {

        return url.toString();
    }

    public void setModel(String model) {
        this.model = model;
    }


}
