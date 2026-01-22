package lr8;

import java.io.*;

public class Task3 {
    static void main() {
        final String SOURCE_FILE = "pushkin.txt";
        final String DEST_FILE = "pshkn.txt";
        final char[] RU_CONSONANTS = {'Б', 'В', 'Г', 'Д', 'Ж', 'З', 'Й', 'К',
                'Л', 'М', 'Н', 'П', 'Р', 'С', 'Т', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ'};

        try (BufferedReader reader = new BufferedReader(new FileReader(SOURCE_FILE));
             BufferedWriter writer = new BufferedWriter(new FileWriter(DEST_FILE))) {

            String str;
            int strCount = 1;
            int wordsPerStr = 0;
            while ((str = reader.readLine()) != null) {
                wordsPerStr = 0;

                writer.write("- - - Строка № " + strCount + " - - -");
                writer.newLine();

                for (String word : str.split("[^а-яА-ЯёЁ]+")) {
                    if (word.isEmpty()) continue;
                    char first_letter = Character.toUpperCase(word.charAt(0));
                    for (char consonant : RU_CONSONANTS) if (consonant == first_letter) {
                        writer.write(word);
                        writer.newLine();
                        wordsPerStr++;
                        break;
                    }
                }
                writer.write("- Слов в строке: " + wordsPerStr);
                writer.newLine();
                writer.newLine();
                strCount++;
            }
        } catch (IOException e) { System.out.println("Error: " + e); }
    }
}
