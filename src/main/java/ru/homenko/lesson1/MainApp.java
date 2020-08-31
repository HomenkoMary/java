package ru.homenko.lesson1;

public class MainApp {
    public static void main(String[] args) {

        byte a = 100;
        short b = 2000;
        int c = 1;
        long d = 254565;
        float e = 2.15f;
        double f = 3.26;
        char g = '\u1252';
        boolean h = true;

        int result = calculate(1,3,18,2);
        System.out.println("result: " + result);

        System.out.println("Сумма 12 и 6 меньше 20 но больше 10: " + compare(12, 6));

        positive_or_negative_int(0);

        System.out.println("-10 - отрицательное число? - " + is_negative_int(-10));

        hello("Mary");

        Year(2021);
    }

    public static int calculate(int a, int b, int c, int d) {
        int result = c / d + b * a;
        return result;
    }

    public static boolean compare(int a, int b){
        int c = a + b;
        boolean e = false;
        if (c >=10 && c <= 20){
            e = true;
        }
        return e;
    }

    public static void positive_or_negative_int(int a){
        if (a >= 0){
            System.out.println("Переменная " + a + " - положительная");
        }
        else{
            System.out.println("Переменная " + a + " - отрицательная");
        }
    }

    public static boolean is_negative_int(int a){
        boolean b = false;
        if (a < 0){
            b = true;
        }
        return b;
    }

    public static void hello(String a){
        System.out.println("Привет " + a);
    }
    static void Year (int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            System.out.println(year + " г. не високосный");
        }
        else {
            System.out.println(year + " г. високосный");
        }
    }
}
