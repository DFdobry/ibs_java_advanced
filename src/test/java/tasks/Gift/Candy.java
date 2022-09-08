package tasks.Gift;

public class Candy extends Gift {

    private String uniqueParam;
    public Candy(String brand, int price, int weight, String uniqueParam) {
        super(brand, price, weight);
        this.uniqueParam = uniqueParam;

    }

    @Override
    public String toString() {
        return "Candy. " + "бренд: " + getBrand() + ", цена: " + getPrice() + ", вес: " + getWeight() + ", вид: " + uniqueParam;
    }
}
