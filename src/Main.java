public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.1");

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println("Задание 1.2");

        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }
        System.out.println("Задание 1.3");

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Задание 1.4");

        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
        System.out.println("Задание 2.1");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("Задание 2.2");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Задание 2.3");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Задание 3.1");
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + 29000;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей.");
        }
        System.out.println("Задание 3.2");
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей.");
        }
    }
    }
