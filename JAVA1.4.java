import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kolvoTochek = 0;
        double radius = 0.0;
        double x = 0.0;
        double y = 0.0;
        int count = 0;

/*Проверим, что данные введены корректно*/
        System.out.println("Введите количество точек");
        if (scanner.hasNextInt()) {
            kolvoTochek = scanner.nextInt();
            if (kolvoTochek < 0) {
                System.out.println("Введите корректное количество точек");
                System.exit(0);
            }

            System.out.println("Введите радиус окружности (в формате числа с плавающей точкой, например : '5,5' )");
            if (scanner.hasNextDouble()) {
                radius = scanner.nextDouble();
                if (radius < 0) {
                    System.out.println("Введены некорректные данные радиуса");
                    System.exit(0);
                }
            }

            else {
                System.out.println("Введите радиус корректно");
                System.exit(0);
            }
        }

        else {
            System.out.println("Введите целые числа в качестве значений!");
            System.exit(0);
        }

        /*Проверим корректность вводимых значений и расчитаем количество подходящих точек*/
        while (kolvoTochek != 0) {
            System.out.println("Введите значение x (в формате числа с плавающей точкой, например : '5,5' )");
            if (scanner.hasNextDouble()) {
                x = scanner.nextDouble();
            }

            System.out.println("Введите значение y (в формате числа с плавающей точкой, например: '5,5' )");
            if (scanner.hasNextDouble()) {
                y = scanner.nextDouble();

                if( (x*x) + (y*y) <= (radius* radius)) {
                    count +=1;
                }
            }

            else {

                System.out.println("Введите корректные значения!");
                scanner.next();

            }
            kolvoTochek -=1;
        }

        System.out.println("Количество точек :" + count);
        scanner.close();
    }
}