package tasks.Gift;

public class Jellybean extends Gift {
    public Jellybean(String brand, int price, int weight, String uniqueParam) {
        super(brand, price, weight, uniqueParam);

    }

    @Override
    public String toString() {
        return "JellyBean. " + "бренд: " + getBrand() + ", цена: " + getPrice() + ", вес: " + getWeight() + ", вид " + getUniqueParam();
    }
}
