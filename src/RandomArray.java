import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ведите любое целое начальное число диапазана - ");
        int min = 0;
        while (min <= 0) {
            if (sc.hasNextInt()) {
                min = sc.nextInt();
                if (min <= 0) {
                    System.out.print("Введенное число должно быть больше 0. Повторите ввод: ");
                }
            } else {
                System.out.print("Вы ввели не число. Повторите ввод:");
                sc.next();
            }
        }
        System.out.print("ведите любое целое конечное число диапазана - ");
        int max = 0;
        int min2 = min + 2;
        while (max < min2) {
            if (sc.hasNextInt()) {
                max = sc.nextInt();
                if (max < min2) {
                    System.out.print("Введенное число должно быть больше " + min + " на 2. Повторите ввод: ");
                }
            } else {
                System.out.print("Вы не ввели целое число. Повторите ввод:");
                sc.next();
            }
        }
        System.out.print("Задайте количество случайных целых чисел -");
        int random = 0;
        if (sc.hasNextInt()) {
            random = sc.nextInt();
        } else {
            System.out.print("Вы не ввели целое число. Повторите ввод:");
            sc.next();
        }

        int arrayLength;
        if (max < min) {
            int mid = max;
            max = min;
            min = mid;
        }
        int number = max - min;
        if (random > number) {
            arrayLength = number;
        } else {
            arrayLength = random;
        }
        System.out.print("max = " + max + "\nmin = " + min + "\nдиапазон - " + arrayLength);
        int rnd = rnd(min, max, arrayLength);
    }

    public static int rnd(int min, int max, int arrayLength) {
        int[] randomArray = new int[arrayLength];
        max -= min;
        for (int i = 0; i < arrayLength; i++) {

        }
        return (int) (Math.random() * ++max) + min;
    }
}
