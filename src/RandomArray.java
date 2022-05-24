import java.util.Arrays;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // задаем начальное число диапазона
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

        // задаем конечное число диапазона
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

        // задаем количество случайных целых чисел
        System.out.print("Задайте количество случайных целых чисел -");
        int random = 0;
        if (sc.hasNextInt()) {
            random = sc.nextInt();
        } else {
            System.out.print("Вы не ввели целое число. Повторите ввод:");
            sc.next();
        }

        // проверяем что бы max не было меньше min, если это так то
        //  меняем местами min и max
        int arrayLength;
        if (max < min) {
            int mid = max;
            max = min;
            min = mid;
        }

        int number = max - min;
        arrayLength = Math.min(random, number);
        System.out.println("max = " + max + "\nmin = " + min);
        System.out.println("заданное пользователем число - " + random +
                "\nвычесленное число - " + number + "\nвычесленная длинна массива - " + arrayLength);
        int[] rnd = rnd(min, max, arrayLength);
        System.out.println("Массив - " + Arrays.toString(rnd));
        Arrays.stream(rnd).filter(i -> i%2==0).forEach(System.out::println);
    }

    public static int[] rnd(int min, int max, int arrayLength) {
        int[] randomArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            int mRandom = (int) (Math.random() * ((max - min) + 1)) + min;
            randomArray[i] = mRandom;
        }
        return randomArray;
    }
}
