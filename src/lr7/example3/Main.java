package lr7.example3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое будет передано суперклассу:");
        int num1 = in.nextInt();
        in.nextLine();
        System.out.println("Введите символ, который будет передан 1-му подклассу:");
        String str = in.nextLine();
        char aChar1 = str.charAt(0);
        System.out.println("Введите текст, который будет передан 2-му подклассу:");
        String str1 = in.nextLine();
        SuperClassTask3 obj = new SuperClassTask3(num1);
        SubClassTask3 obj1 = new SubClassTask3(num1,aChar1);
        SubClass2Task3 obj2 = new SubClass2Task3(num1, aChar1, str1);

        System.out.println(obj.toString()+"\n"+obj1.toString()+"\n"+obj2.toString());
    }
}
