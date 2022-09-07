package tasks.Gift;

public class Candy extends Gift {

    public Candy(String brand, int price, int weight, String uniqueParam) {
        super(brand, price, weight, uniqueParam);

    }

    @Override
    public String toString() {
        return "Candy. " + "бренд: " + getBrand() + ", цена: " + getPrice() + ", вес: " + getWeight() + ", вид: " + getUniqueParam();
    }
}
