package lr8.Task1.example7;
import java.io.*;

public class Example7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("D:\\MyFile1.txt"), 1024);
            bw = new BufferedWriter(new FileWriter("D:\\MyFile2.txt"));

            int lineCount = 0;
            String s;

            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(s);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!");
        } finally {
            if (br != null) {
                br.close();
            }
            if (bw != null) {
                bw.flush();
                bw.close();
            }
        }
    }
}