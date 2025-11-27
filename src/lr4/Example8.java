package lr4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String encryptString = in.nextLine();
        System.out.println("Введите ключ для шифрования:");
        int shift = in.nextInt();
        in.nextLine();
        String encryptedString = Main.getEncryptString(encryptString,shift);
        System.out.printf("Текст после шифрования: \n%s%n",encryptedString);
        String ans;
        while (true){
            System.out.println("Выполнить обратное преобразование? (y/n)");
            ans = in.nextLine();
            if (ans.equals("n")){
                System.out.println("До свидания!");
                break;
            } else if (ans.equals("y")){
                String decryptedString = Main.getDecryptString(encryptedString,shift);
                System.out.printf("Текст после дешифрования: \n%s%n",decryptedString);
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }
        in.close();
    }
}
