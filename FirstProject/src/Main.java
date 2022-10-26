import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("Праздник будет " + "13.09." + year);
        } else {
            System.out.println("Праздник будет " + "12.09." + year);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 100 == 0 && year % 400 != 0) {
            return true;
        } else if (year % 400 == 0 || year % 4 == 0) {
        }
        return false;
    }
}