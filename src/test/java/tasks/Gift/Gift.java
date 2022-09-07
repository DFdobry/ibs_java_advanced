package tasks.Gift;

public class Gift {

    private String brand;
    private int price;
    private int weight;
    private String uniqueParam;


    public Gift(String brand, int price, int weight, String uniqueParam) {
        this.brand = brand;
        this.price = price;
        this.weight = weight;
        this.uniqueParam = uniqueParam;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getUniqueParam() {
        return uniqueParam;
    }

    public void setUniqueParam(String uniqueParam) {
        this.uniqueParam = uniqueParam;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
