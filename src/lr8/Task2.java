package lr8;

import java.io.*;

public class Task2 {
    static void main() {
        final String SOURCE_FILE = ("source.txt");
        final String DEST_FILE   = ("dest.txt");
        final int DOUBLES_COUNT = 5;

        try (DataOutputStream dOut = new DataOutputStream(new FileOutputStream(SOURCE_FILE))) {
            dOut.writeUTF("First");
            dOut.writeUTF("Second");
            for (int i = 0; i < DOUBLES_COUNT; i++) dOut.writeDouble(Math.random() - Math.random());
        } catch (IOException e) { System.out.println("Error: " + e); }

        try (DataInputStream dIn = new DataInputStream(new FileInputStream(SOURCE_FILE));
             DataOutputStream dOut = new DataOutputStream(new FileOutputStream(DEST_FILE))) {

            dIn.readUTF();
            dOut.writeUTF(dIn.readUTF());
            for (int i = 0; i < DOUBLES_COUNT; i++) {
                double tmp = dIn.readDouble();
                if (tmp >= 0) dOut.writeDouble(tmp);
            }
        } catch (IOException e) {System.out.println("Error: " + e);}
     }
}
