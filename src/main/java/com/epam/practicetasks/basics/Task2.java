package main.java.com.epam.practicetasks.basics;

public class Task2 {

    public static void main(String[] args) {
        System.out.print("1. ");
        System.out.println(function(5, 2, 4));
        System.out.print("2. ");
        System.out.println(function(0, 7, 8));
        System.out.print("3. ");
        System.out.println(function(-5, 1, 1));
    }

    public static double function(double a, double b, double c) {
        double x = -1;
        if (b * b + 4 * a * c < 0) {
            System.out.println("Ошибка вычисления: подкоренное выражение должно быть не меньше 0");
        } else if (a == 0) {
            System.out.println("Ошибка вычисления: а не может быть равно 0");
        } else {
            x = (b + Math.sqrt(b * b + 4 * a * c)) / 2 / a - Math.pow(a, 3) * c + Math.pow(b, -2);
        }
        return x;
    }
}
