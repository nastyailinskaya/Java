import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day = 0;
        int month = 0;

/*Проверим, что все введённые данные являются целыми числами*/
        System.out.println("Введите день");
        if (scanner.hasNextInt()) {
            day = scanner.nextInt();
            if ((day > 31) || (day < 1)) {
                System.out.println("Введены некорректные данные дня");
                System.exit(0);
            }

            System.out.println("Введите месяц");
            if (scanner.hasNextInt()) {
                month = scanner.nextInt();
                if ((month > 12) || (month < 1)) {
                    System.out.println("Введены некорректные данные дня");
                    System.exit(0);
                }

            } else {
                System.out.println("Введите целые числа в качестве значений!");
                scanner.next();
            }
        }
        else {
            System.out.println("Введите целые числа в качестве значений!");
            scanner.next();
        }
        /*Устанавливаем соответствия между месяцами и временами года*/
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }
        scanner.close();
    }
}