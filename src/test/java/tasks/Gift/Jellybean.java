package tasks.Gift;

public class Jellybean extends Gift {
    private String uniqueParam;
    public Jellybean(String brand, int price, int weight, String uniqueParam) {
        super(brand, price, weight);
        this.uniqueParam = uniqueParam;

    }

    @Override
    public String toString() {
        return "JellyBean. " + "бренд: " + getBrand() + ", цена: " + getPrice() + ", вес: " + getWeight() + ", вид: " + uniqueParam;
    }
}
