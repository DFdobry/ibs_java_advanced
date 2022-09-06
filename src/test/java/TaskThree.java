import java.util.Arrays;

public class TaskThree {
    public static void main(String[] args) {
        int[] array = new int[20];
        int maxNegNumber = 0;
        int minPosNumber = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 20) -10);
            if(array[i] < 0) {
                if(array[i] > array[maxNegNumber]) {
                    maxNegNumber = i;
                }
                if (array[maxNegNumber] >= 0) {
                    maxNegNumber = i;
                }
            } else if (array[i] > 0) {
                if (array[i] < array[minPosNumber]) {
                    minPosNumber = i;
                }
                if (array[minPosNumber] <= 0) {
                    minPosNumber = i;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Минимальное позитивное число: " + array[minPosNumber]);
        System.out.println("Максимальное негативное число: " + array[ maxNegNumber]);
        int temp = array[minPosNumber];
        array[minPosNumber] = array[maxNegNumber];
        array[maxNegNumber]  = temp;
        System.out.println(Arrays.toString(array));
    }
}
