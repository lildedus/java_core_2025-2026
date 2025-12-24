package lr8.Task1.example1;

import java.io.File;

public class Example1 {
    public static void main(String[] args) {
        try {
            //Создание файла в текущей папке
            File f1 = new File("File1.txt");
            f1.createNewFile();
            if (f1.exists()){
                System.out.println("Файл создан!");
                System.out.println("Полный путь: "+f1.getAbsolutePath());
            }
            //Создание файла на диске D
            File f2 = new File("D:\\File2.txt");
            f2.createNewFile();
            if (f2.exists()){
                System.out.println("Файл создан!");
                System.out.println("Полный путь: " + f2.getAbsolutePath());
            }
            //Создание нескольких вложенных папок
            File f3 = new File("D:\\Test\\Package1\\Package2");
            f3.mkdirs();
            System.out.println("Полный путь: " + f3.getAbsolutePath());
        } catch (Exception e){
            System.out.println("Ошибка!" + e);
        }
    }
}
