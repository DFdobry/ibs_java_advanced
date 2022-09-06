package tasks.Gift;

public class Jellybean extends Gift {
    public Jellybean(String brand, int price, int weight) {
        super(brand, price, weight);

    }

    @Override
    public String toString() {
        return "JellyBean. " + "бренд: " + getBrand() + ", цена: " + getPrice() + ", вес: " + getWeight();
    }
}
