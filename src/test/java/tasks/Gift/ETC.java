package tasks.Gift;

public class ETC extends  Gift{

    public ETC(String brand, int price, int weight, String uniqueParam) {
        super(brand, price, weight, uniqueParam);
    }

    @Override
    public String toString() {
        return "ETC. " + "бренд: " + getBrand() + ", цена: " + getPrice() + ", вес: " + getWeight() + ", вид: " + getUniqueParam();
    }
}
