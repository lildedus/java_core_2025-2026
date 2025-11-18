package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();
        System.out.println("Введите год вашего рождения: ");
        int year = in.nextInt();
        year = 2025 - year;
        if (((year > 20) && ((year % 10) <= 4)) || (year <= 4)) {
            System.out.printf("Имя %s \nВозраст %d года \n", name, year);
        } else {
            System.out.printf("Имя %s \nВозраст %d лет \n", name, year);
        }
        in.close();
    }
}
