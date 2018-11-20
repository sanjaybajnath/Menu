public class Trio implements MenuItem {

    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio (Sandwich sandwich, Salad salad, Drink drink){
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName(){
        return this.sandwich.getName()+"/"+this.salad.getName()+"/"+this.drink.getName()+" Trio";
    }

    public double getPrice(){
        double p1 = this.sandwich.getPrice();
        double p2 = this.salad.getPrice();
        double p3 = this.drink.getPrice();
        if (p1 <= p2 && p1 <= p3) {
            return p2 + p3;
        }
        if (p1 >= p3){
            return p1+p3;
        }
        return p1 +p2;
    }
}
