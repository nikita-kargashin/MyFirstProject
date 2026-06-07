package lr10.Task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class JsonParser {
    static void main() {
        final String FILE_PATH = "src/lr10/Task2/example-json.json";

        try (FileReader reader = new FileReader((FILE_PATH))){
            JSONObject jsonObject = (JSONObject) new JSONParser().parse (reader);
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            Scanner userInput = new Scanner(System.in);

            loop:
            while (true) {
                System.out.print("""
                        1 для просмотра книг
                        2 для добавления книги
                        3 для поиска книг
                        4 для удаления книги
                        5 для выхода
                        :\s""");
                switch (userInput.nextLine().trim()) {
                    case "1" -> printLibrary(jsonArray);
                    case "2" -> addNewBook(jsonArray, userInput);
                    case "3" -> findBook(jsonArray, userInput);
                    case "4" -> removeBook(jsonArray, userInput);
                    case "5" -> { break loop; }
                    default -> { continue; }
                }
                System.out.println("\n- - - - -\n");
            }

            jsonObject.put("books", jsonArray);
            try (FileWriter file = new FileWriter(FILE_PATH)) { file.write(jsonObject.toJSONString()); }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printLibrary(JSONArray books){ for (Object book : books) printBook((JSONObject) book);}
    private static void printBook(JSONObject book) {
        System.out.println("\nНазвание книги: " +  book.get("title"));
        System.out.println("Автор: " + book.get("author"));
        System.out.println("Год издания: " + book.get("year"));
    }

    private static void addNewBook(JSONArray books, Scanner userInput) {
        JSONObject book = new JSONObject();

        System.out.println("\nНазвание книги: ");
        book.put("title", userInput.nextLine().trim());
        System.out.println("Автор: ");
        book.put("author", userInput.nextLine().trim());
        System.out.println("Года издания: ");
        book.put("year", userInput.nextLine().trim());

        books.add(book);
    }
    private static void findBook(JSONArray books, Scanner userInput) {
        System.out.print("\nАвтор: ");
        String author = userInput.nextLine().trim().toLowerCase();

        for (Object obj : books) {
            JSONObject book = (JSONObject) obj;
            if (( (String) book.get("author")).toLowerCase().equals(author)) printBook(book);
        }
    }
    private static void removeBook(JSONArray books, Scanner userInput) {
        System.out.print("\nНазвание: ");
        String title = userInput.nextLine().trim();
        Iterator<JSONObject> iterator = books.iterator();
        while (iterator.hasNext()) if (iterator.next().get("title").equals(title)) iterator.remove();
    }
}
