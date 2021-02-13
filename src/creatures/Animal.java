package creatures;


public abstract class Animal implements Feedable{
    public static Double pod_wag_psa =4.0;
    public String species;
    public Double weight;
    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;}
    public Animal() {
        this.weight = 20.0;
    }

    public String toString() {
        return species + " " + " " + weight;
    }
    public  void feed(){
        if(weight<18) {
            weight += 3;
            System.out.println("ulał się o 3 kg");

            System.out.println("My weight="+weight);
        }else{
            System.out.println("weź mnie wyprowadz bo zaraz zamiast psa bedzię świania");
        }
    }
    public  void takeForAWalk(){
        if(weight>0) {
            weight -= 3;
            System.out.println("odtyło mi sie 3 kg ");

            System.out.println("My weight="+weight);
        }else{
            System.out.println("ryju mordo chyba mi sie zdechło  ");
        }
    }
    public Salleable salleable = new Salleable() {
        @Override
        public void sell(Human seller, Human buyer, Double price) {
            if(buyer.getCash()>=price) {
                if (seller.getPet() == null) {
                    System.out.println("nie ma zwierzaka");
                } else {
                    System.out.println("jest twoje wymarzone zwierze !!!!!");
                    buyer.setCash(-price);
                    buyer.setPet(seller.getPet());
                    seller.setCash(+price);
                }

                if (seller.getPhone() == null) {
                    System.out.println("nie ma komory");
                } else {
                    System.out.println("jest komora");
                }
            }else {
                System.out.println("chyba cie na to nie stać ziomeg");
            }


        }

    };

}