package main.java.com.epam.practicetasks.basics;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(function(3, 6, 8));
        System.out.println(function(1, 1, 1));
        System.out.println(function(0, -11, 4));
    }

    public static double function(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }
}
