package main.java.com.epam.practicetasks.basics;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(function(5, 4));
        System.out.println(function(Math.PI / 4, Math.PI / 4));
    }

    public static double function(double x, double y) {
        double res = -1;
        if (Math.cos(x) == Math.sin(y)) {
            System.out.println("Ошибка вычисления: знаменатель не может быть равен 0");
        } else if (Math.cos(x * y) == 0) {
            System.out.println("Ошибка вычисления: знаменатель не может быть равен 0");
        } else {
            res = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        }
        return res;
    }
}

