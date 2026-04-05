package lr10.task3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.FileWriter;
import java.io.IOException;

public class NewsParserHTML {
    public static void main(String[] args) {
        String url = "http://books.toscrape.com";
        int maxRetries = 3;
        for (int attempt = 1; attempt <= maxRetries; attempt++) {
            try {
                Document doc = Jsoup.connect(url).get();
                try (FileWriter writer = new FileWriter("src/lr10/task3/books.txt")) {
                    writer.write("Книги с сайта:\n\n");
                    Elements books = doc.select(".product_pod");
                    for (int i = 0; i < Math.min(books.size(), 20); i++) {
                        Element book = books.get(i);
                        String title = book.select("h3 a").attr("title");
                        String price = book.select(".price_color").text();
                        writer.write("Название: " + title + "\nЦена: " + price + "\n\n");
                        System.out.println("Название: " + title + "\nЦена: " + price + "\n");
                    }
                }
                System.out.println("Данные сохранены в books.txt");
                break;
            } catch (IOException e) {
                System.out.println("Ошибка подключения (попытка " + attempt + "): " + e.getMessage());
                if (attempt == maxRetries) e.printStackTrace();
            }
        }
    }
}