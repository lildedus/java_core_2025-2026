package lr10.Example3_4_5;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class NewsParser {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("http://quotes.toscrape.com").get();

            Elements quotes = doc.select(".quote");

            // Выводим все цитаты в консоль
            for (int i = 0; i < quotes.size(); i++) {
                Element quote = quotes.get(i);
                String text = quote.select(".text").text();
                String author = quote.select(".author").text();

                System.out.println("Цитата " + (i+1) + " : " + text);
                System.out.println("Автор : " + author);
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}