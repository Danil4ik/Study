import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);

    //Приветствовать любого пользователя при вводе его имени через командную строку
    public static void Go1() {
        System.out.println("Enter your name:");
        String Name = scanner.next();
        System.out.println("Hallo " + Name + "!");

    }

    //Ввести пароль из командной строки и сравнить его со строкой-образцом
    public static void Go2() {

        System.out.println("Enter the password:");
        String password_orig = "HULK";
        String password_enter = scanner.next();
        if (password_orig.equals(password_enter))
            System.out.println("Password is valid");
        else System.out.println("Invalid password, try again");

    }

    //Ввести с консоли 5 целых чисел. На консоль вывести четные и нечетные числа
    public static void Go3() {
        int[] values = new int[5];
        System.out.println("Enter 5 values:");
        for (int i = 0; i < 5; i++) {
            values[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (values[i] % 2 == 0) {
                System.out.println("Четное   " + values[i]);
            } else if (values[i] % 2 != 0) {
                System.out.println("Нечетное " + values[i]);
            }
        }
    }

    //Ввести с консоли 5 целых чисел. На консоль вывести наибольшее и наименьшее число
    public static void Go4() {
        int[] values = new int[5];
        System.out.println("Enter 5 values:");
        for (int i = 0; i < 5; i++) {
            values[i] = scanner.nextInt();
        }
        int max = values[0];
        for (int i = 0; i < 5; i++) {
            if (max < values[i])
                max = values[i];
        }
        System.out.println("max " + max);

        int min = values[0];
        for (int i = 0; i < 5; i++) {
            if (min > values[i])
                min = values[i];
        }
        System.out.println("min " + min);
    }

    //Ввести с консоли 5 целых чисел. На консоль вывести числа, которые делятся на 3 или на 9
    public static void Go5() {
        int[] values = new int[5];
        System.out.println("Enter 5 values:");
        for (int i = 0; i < 5; i++) {
            values[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (values[i] % 3 == 0) {
                System.out.println("Кратное 3м  " + values[i]);
            }
        }
        for (int i = 0; i < 5; i++) {
            if (values[i] % 9 == 0) {
                System.out.println("Кратное 9ти " + values[i]);
            }
        }

    }

    //Ввести с консоли 5 целых чисел. На консоль вывести числа, которые делятся на 5 и на 7
    public static void Go6() {
        int[] values = new int[5];
        System.out.println("Enter 5 values:");
        for (int i = 0; i < 5; i++) {
            values[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (values[i] % 5 == 0) {
                if (values[i] % 7 == 0) {
                    System.out.println("Кратное 5 и 7 " + values[i]);
                }


            }
        }
    }

    //Ввести с консоли 5 целых чисел. На консоль вывести все трехзначные числа, в десятичной записи которых нет одинаковых цифр ???
    public static void Go7() {
        int[] values = new int[5];
        System.out.println("Enter 5 values:");
        for (int i = 0; i < 5; i++) {
            values[i] = scanner.nextInt();
        }
        int a, b, c;
        for (int i = 0; i < 5; i++) {
            if ((values[i] > 99) && (values[i] < 1000)) {
                a = values[i] / 10 / 10;
                b = values[i] / 10 % 10;
                c = values[1] % 100 % 10;
                if (a != b & a != c && b != a & b != c & c != a & c != b)
                    System.out.println(values[i]);
            }


        }

    }

    //Ввести с консоли 5 целых чисел. На консоль вывести "Счастливые» числа" ???
    public static void Go8() {
        int[] values = new int[5];
        System.out.println("Enter 5 values:");
        for (int i = 0; i < 5; i++) {
            values[i] = scanner.nextInt();
        }
        int a = 0, b = 0;
        for (int i = 0; i < 5; i++) {
            if ((values[i] > 99999) && (values[i] < 1000000)) {
                a = values[i] / 1000;
                b = values[i] % 1000;

                int sum_a = 0;
                int sum_b = 0;
                while (a != 0) {
                    sum_a += a % 10;
                    a = a / 10;
                }
                while (b != 0) {
                    sum_b += b % 10;
                    a = b / 10;
                }
                if (sum_a == sum_b) {
                    System.out.println(values[i]);
                }
            }
        }

    }

    //Ввести с консоли 5 целых чисел. На консоль вывести элементы, которые равны полусумме соседних элементов ??
    public static void Go9() {
        int[] values = new int[5];
        System.out.println("Enter 5 values:");
        for (int i = 0; i < 5; i++) {
            values[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {//Почему i < 5-2 ?
            if ((values[i] + values[i + 2]) / 2 == values[i + 1]) {
                System.out.println(values[i + 1]);
            }
        }
    }

    public static void Go10() {
        int a = 10;
        int[] b = {10, 2, 4, 5};
        int[] c = new int[8];

        /*for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        for (int x: c ){
            System.out.println(x);
        }*/

        double[] doubles = Arrays.stream(c)
                .filter(s -> s % 2 == 0)
                .mapToDouble(s -> s * 2.5)
                .map(d -> d * 10)
                .sorted()
                .toArray();//создал новый массив с измененными переменными // нажал Ctrl + Alt + V(arieble) и поменял верхнюю строку

        System.out.println(Arrays.toString(doubles)); // преобразовуем массив в строку и выводим
    }

    //двухмерный массив
    public static void Go11() {
        int[][] b = {{5, 6, 3},
                {4, 2, 6}};
        System.out.println(Arrays.deepToString(b)); //выводит массив в глубину
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " "); //первым форам задаем номер вагона, вторым - место
            }
            System.out.println();
        }
        for (int[] ints : b) { // 13:18 time
            for (int anInt : ints) {
                System.out.println(anInt + " ");
            }

        }
    }
    //инверсия массива
    public static void Go12() {
        int[] b = {5, 6, 3, 8, 7, 9};
        int[] b1 = {5, 8, 9, 8, 11, 4};
        int a = b[4];
        System.out.println(a);
        /*invert(b); //выносим метод
        invert(b1);
    }

    private static void invert(int[] b) {
        for (int i = 0; i < b.length / 2; i++) {
            int temp = b[i];
            b[i] = b[b.length - 1 - i];
            b[b.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(b));*/ // пересмотреть время 14:00
    }

    //bubble-sort
    public static void Go13() {
        int[] b = {5, 6, 3, 8, 7, 9};
        int[] b1 = {5, 8, 9, 8, 11, 4};
        sort(b);

    }

    private static void sort(int[] b) {
        for (int i = b.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (b[j] > b[j + 1]) {
                    int tmp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = tmp;

                }
                System.out.println(b);
            }

        }
    }

    public static void Go_test() {
        int [] a = new int[5];
        System.out.println("Enter values: ");
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();

            }
        }
    }

