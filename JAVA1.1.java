import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int this_day = 25;
        int this_month = 11;
        int this_year = 2022;
        int day = 0;
        int month = 0;
        int year = 0;
        int old_year = 0;
        int old_month = 0;
        int old_day = 0;
        int old_day_ost = 0;

/*Проверим, что все введённые данные являются целыми числами*/
        System.out.println("Введите день вашего рождения");
        if (scanner.hasNextInt()){
            day = scanner.nextInt();
            old_day = this_day - day;
            if ((day > 31) || (day < 1)) {
                System.out.println("Введены некорректные данные дня");
                System.exit(0);
            }

            System.out.println("Введите месяц вашего рождения");
            if (scanner.hasNextInt()){
                month = scanner.nextInt();
                old_month = this_month - month;
                if ((month > 12) || (month < 1)) {
                    System.out.println("Введены некорректные данные месяца");
                    System.exit(0);
                }
                System.out.println("Введите год вашего рождения");

                if (scanner.hasNextInt()){
                    year = scanner.nextInt();
                    old_year = this_year - year;
                    if (year > 2022) {
                        System.out.println("Введены некорректные данные года");
                        System.exit(0);
                    }
                }

                else {
                    System.out.println("Введите целые числа в качестве значений!");
                    scanner.next();
                }

            }
            else {
                System.out.println("Введите целые числа в качестве значений!");
                scanner.next();
            }
        }
        else {
            System.out.println("Введите целые числа в качестве значений!");
            scanner.next();
        }

        /*Преобразуем числа, чтобы в итоге не получить отрицательных значений*/
        old_day = old_day + (old_year * 365) + (old_month * 30);
        old_day_ost = old_day % 365;
        old_year = (old_day - old_day_ost) / 365;
        old_day =  old_day_ost % 30;
        old_month = (old_day_ost - old_day) / 30;
        System.out.println(old_year + " лет, " + old_month + " месяцев, " + old_day + " дней.");

        scanner.close();
    }
}