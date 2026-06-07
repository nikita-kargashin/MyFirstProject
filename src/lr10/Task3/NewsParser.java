package lr10.Task3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.FileWriter;
import java.util.Arrays;


public class NewsParser {
    static void main() {
        try {
            Document doc = null;
            for (int i = 0; i < 3; i++) {
                try {
                    doc = Jsoup.connect("https://panorama.pub/").get();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    Thread.sleep(2000);
                }
            }
            if (doc == null) return;

            Elements newsElements = doc.select(".mt-4 > li > a > div:nth-child(2) > div:nth-child(1)");

            String[] news = new String[Math.min(10, newsElements.size())];
            Arrays.setAll(news, i -> newsElements.get(i).text());

            for (String title : news) System.out.println(title);

            try (FileWriter writer = new FileWriter("src/lr10/Task3/news.txt")) {
                for (String title : news) writer.write(title + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}