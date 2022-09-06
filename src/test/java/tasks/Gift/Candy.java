package tasks.Gift;

public class Candy extends Gift {

    public Candy(String brand, int price, int weight) {
        super(brand, price, weight);

    }

    @Override
    public String toString() {
        return "Candy. " + "бренд: " + getBrand() + ", цена: " + getPrice() + ", вес: " + getWeight();
    }
}
