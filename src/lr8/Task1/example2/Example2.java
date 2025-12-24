package lr8.Task1.example2;

import javax.imageio.IIOException;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Example2 {
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        try {
            InputStream inFile = new FileInputStream("C:\\Users\\alex\\IdeaProjects" +
                    "\\java_core_2025-2026\\src\\lr8\\example2\\file.txt");
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();

            InputStream inUrl = new URL("https://google.com").openStream();
            readAllByByte(inUrl);
            System.out.print("\n\n\n");
            inUrl.close();

            InputStream inArray = new ByteArrayInputStream(new byte[]{ 72, 101, 108, 108, 111 });
            readAllByByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();

        } catch (IOException e){
            System.out.println("Ошибка! "+ e);
        }
    }
}
