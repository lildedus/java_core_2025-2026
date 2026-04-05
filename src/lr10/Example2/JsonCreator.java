package lr10.Example2;

import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonCreator {
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        // Первая книга
        JSONObject book1 = new JSONObject();
        book1.put("title", "Java Programming");
        book1.put("author", "John Doe");
        book1.put("year", "2015");
        books.add(book1);

        // Вторая книга
        JSONObject book2 = new JSONObject();
        book2.put("title", "Python Programming");
        book2.put("author", "Jane Smith");
        book2.put("year", "2018");
        books.add(book2);

        // Третья книга
        JSONObject book3 = new JSONObject();
        book3.put("title", "Ruby Programming");
        book3.put("author", "Bob Johnson");
        book3.put("year", "2016");
        books.add(book3);

        library.put("books", books);

        try (FileWriter file = new FileWriter("src/lr10/example2/example-json.json")) {
            file.write(library.toJSONString());
            System.out.println("JSON файл создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}