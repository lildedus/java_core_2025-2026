package lr7.example2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст для суперкласса:");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        SuperClassTask2 superClassTask2 = new SuperClassTask2(string);
        System.out.println("Длина текста: " + superClassTask2.getStr1Length());
        System.out.println("Введите целое число:");
        int x = in.nextInt();
        in.nextLine();
        System.out.println("Введите текст для подкласса:");
        String string1 = in.nextLine();
        SubClassTask2 subClassTask2 = new SubClassTask2(x,string1);
        subClassTask2.setStr1();
        System.out.println("После setStr1(): текст = 'null', num = " + subClassTask2.num + ", длина текста = " + subClassTask2.getStr1Length());

        subClassTask2.setStr1(string1);
        System.out.println("После setStr1(String): текст = '" + string1 + "', num = " + subClassTask2.num + ", длина текста = " + subClassTask2.getStr1Length());

        subClassTask2.setStr1(x);
        System.out.println("После setStr1(int): текст = '" + string1 + "' (без изменений), num = " + subClassTask2.num + ", длина текста = " + subClassTask2.getStr1Length());

        subClassTask2.setStr1(string1, x);
        System.out.println("После setStr1(String, int): текст = '" + string1 + "', num = " + subClassTask2.num + ", длина текста = " + subClassTask2.getStr1Length());

        System.out.println("\nИтоговые значения:");
        System.out.println("Число в подклассе: " + subClassTask2.num);
        System.out.println("Длина текста в подклассе: " + subClassTask2.getStr1Length());
        in.close();
    }
}
