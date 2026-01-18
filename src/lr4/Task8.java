package lr4;

import java.util.Scanner;

class Task8 {
    static void main() {
        Scanner userInput = new Scanner(System.in);

        IO.print("Введите текст для шифрования: ");
        char[] text = userInput.nextLine().toCharArray();
        IO.print("Введите ключ: ");
        char[] key = userInput.nextLine().toLowerCase().toCharArray();

        IO.println();
        for (int i = 0; i < text.length; i++) {
            if (text[i] >= 'а' && text[i] <= 'я') text[i] = key[text[i] - 'а'];
            else if (text[i] >= 'А' && text[i] <= 'Я') text[i] = Character.toUpperCase(key[text[i] - 'А']);
            IO.print(text[i]);
        }

        IO.print("\n\nВыполнить обратное преобразование? (y/n): ");

        switch (userInput.nextLine()) {
            case "y": {
                for (int i = 0; i < text.length; i++) {
                    if (!(text[i] >= 'а' && text[i] <= 'я') && !(text[i] >= 'А' && text[i] <= 'Я')) continue;
                    boolean isUpper = Character.isUpperCase(text[i]);
                    if (isUpper) text[i] = Character.toLowerCase(text[i]);
                    for (int j = 0; j < key.length; j++) {
                        if (text[i] == key[j]) {
                            text[i] = (isUpper) ? Character.toUpperCase((char) ('а' + j)) : (char) ('а' + j);
                            break;
                        }
                    }
                }

                IO.println();
                for (char letter : text) IO.print(letter);
                break;
            }
            case "n" :
            {
                IO.print("\nДо свидания!");
                break;
            }
            default: IO.print("\nВведите коррекктный ответ");
        }
        IO.println();

        userInput.close();
    }
}