import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите программу: 1 - массив слов, 2 - калькулятор");
        int operation = scanner.nextInt();
        switch (operation) {
            case 1:
                int max_world_len = 0;
                Scanner console = new Scanner(System.in);
                System.out.println("Введите размер массива:");
                int size = console.nextInt();
                System.out.println("Введите слова:");
                Scanner scanner1 = new Scanner(System.in);
                String[] array = new String[size];
                for (int i = 0; i < array.length; i++) {
                    array[i] = scanner1.nextLine();
                    if (array[i].length() > array[max_world_len].length()) {
                        max_world_len = i;
                    }
                }
                System.out.println("Самое длинное слово: " + array[max_world_len]);
                break;
            case 2:
                Scanner console1 = new Scanner(System.in);
                System.out.println("Выберите тип операции для дробного числа: 1 - сложение, 2 - умножение, 3 - деление, 4 - вычитание");
                int value = console1.nextInt();
                System.out.println("Введите дробное число:");
                double firstNumber = console1.nextDouble();
                double secondNumber = console1.nextDouble();
                double answer = 0;
                switch (value) {
                    case 1:
                        answer = firstNumber + secondNumber;
                        String result = String.format("%.4f", answer);
                        System.out.println(result);
                        break;
                    case 2:
                        answer = firstNumber * secondNumber;
                        String resultTwo = String.format("%.4f", answer);
                        System.out.println(resultTwo);
                        break;
                    case 3:
                        answer = firstNumber / secondNumber;
                        String resultThree = String.format("%.4f", answer);
                        System.out.println(resultThree);
                        break;
                    case 4:
                        answer = firstNumber - secondNumber;
                        String resultFour = String.format("%.4f", answer);
                        System.out.println(resultFour);
                        break;
                }
        }
    }
}
