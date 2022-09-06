package tasks.Gift;

public class ETC extends  Gift{

    public ETC(String brand, int price, int weight) {
        super(brand, price, weight);
    }

    @Override
    public String toString() {
        return "ETC. " + "бренд: " + getBrand() + ", цена: " + getPrice() + ", вес: " + getWeight();
    }
}
