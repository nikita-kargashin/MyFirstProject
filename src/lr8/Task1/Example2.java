package lr8.Task1;

import java.io.*;
import java.net.URL;

public class Example2 {
}

class Primer1 {
    // Метод для чтения данных из потока по байтам с выводом
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); // читает 1 байт
            if (oneByte != -1) { // признак отсутствия конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            // С потоком связан файл
            InputStream inFile = new FileInputStream("C:\\Users\\admin\\IdeaProjects\\MyFirstProject\\src\\lr8\\text.txt");
            readAllByByte(inFile);
            System.out.print("\n\n");
            inFile.close();
            // Файл предварительно создан
            // и заполнен данными

            // С потоком связана интернет-страница
            InputStream inUrl = new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.print("\n\n");
            inUrl.close();

            // С потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[]{7, 9, 3, 7, 4});
            readAllByByte(inArray);
            // массив
            System.out.print("\n\n");
            inArray.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
