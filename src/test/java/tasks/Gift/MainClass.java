package tasks.Gift;

public class MainClass {

    public static void main(String[] args) {
        Candy candys = new Candy("красный октябрь", 270, 250);
        Jellybean jellybean = new Jellybean("бон пари", 350, 400);
        ETC etc = new ETC("something", 500, 300);
        Gift [] sweetBox = {candys, jellybean, etc};
        System.out.println("Информация о сладостях в подарке:");
        for (int i = 0; i < sweetBox.length; i++) {
            System.out.println(sweetBox[i]);
        }
        int sumWeight = candys.getWeight() + jellybean.getWeight() + etc.getWeight();
        System.out.println("Общий вес подарка: " + sumWeight + " гр");
        int sumPrice = candys.getPrice() + jellybean.getPrice() + etc.getPrice();
        System.out.println("Общая стоимость подарка: " + sumPrice + " руб");
    }



}

