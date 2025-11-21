package lr3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7: ");
        int x = in.nextInt();
        System.out.println("Введенное число "+x);
        switch (x){
            case 1:
                System.out.println("Это понедельник") ;
                break;
            case 2:
                System.out.println("Это вторник");
                break;
            case 3:
                System.out.println("Это среда");
                break;
            case 4:
                System.out.println("Это четверг");
                break;
            case 5:
                System.out.println("Это пятница");
                break;
            case 6:
                System.out.println("Это суббота");
                break;
            case 7:
                System.out.println("Это воскресенье");
                break;
            default:
                System.out.println("Введено неверное число!");

        }
        in.close();
    }
}


/*
1. Напишите программу, в которой пользователь вводит целое число
в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
Если введенное пользователем число выходит за допустимый диапазон,
выводится сообщение о том, что введено некорректное значение.
Используйте оператор выбора switch.
*/
