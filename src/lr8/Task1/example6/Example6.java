package lr8.Task1.example6;

import java.io.*;

public class Example6 {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;

        try {
            in = new FileReader("D:\\MyFile1.txt");
            out = new FileWriter("D:\\MyFile2.txt", true);

            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.append((char)oneByte);
                System.out.print((char)oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!");
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}