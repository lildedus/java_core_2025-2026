package lr8.Task3;

import java.io.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        String input = "text.txt";
        String output = "result.txt";

        // Создаем файл
        PrintWriter w1 = new PrintWriter(input, "UTF-8");
        w1.println("Я скоро сам расскажу тебе в свое время");
        w1.println("и про свои похождения и про Машу");
        w1.println("Она дочь капитана Миронова");
        w1.println("Я полюбил добрую и умную девушку");
        w1.println("и она ответила мне взаимностью");
        w1.close();

        // Обрабатываем
        BufferedReader r = new BufferedReader(new InputStreamReader
                (new FileInputStream(input), "UTF-8"));
        PrintWriter w2 = new PrintWriter(new OutputStreamWriter
                (new FileOutputStream(output), "UTF-8"));

        String s;
        int n = 0;
        String con = "бвгджзйклмнпрстфхцчшщ";

        while ((s = r.readLine()) != null) {
            n++;
            String[] words = s.split("[\\s\\p{Punct}]+");
            int c = 0;
            StringBuilder sb = new StringBuilder();

            for (String word : words) {
                if (word.length() == 0) continue;
                char ch = word.charAt(0);
                if (ch >= 'А' && ch <= 'Я') ch += 32;
                if (ch >= 'а' && ch <= 'я' && con.indexOf(ch) >= 0) {
                    if (c > 0) sb.append(", ");
                    sb.append(word);
                    c++;
                }
            }

            if (c > 0) {
                w2.println("Строка " + n + ":");
                w2.println("  Слов: " + c);
                w2.println("  Слова: " + sb.toString());
                w2.println();
            }
        }

        r.close();
        w2.close();

        // Вывод результата
        System.out.println("Результат:");
        BufferedReader r2 = new BufferedReader(new InputStreamReader
                (new FileInputStream(output), "UTF-8"));
        String line;
        while ((line = r2.readLine()) != null) {
            System.out.println(line);
        }
        r2.close();
    }
}