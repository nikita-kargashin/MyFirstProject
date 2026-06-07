package lr10.Task4;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;

public class ReadExcelFileExample {
    static void main() {
        String filePath = "src/lr10/Task4/example3.xlsx";

        try(FileInputStream inputStream = new FileInputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {

            XSSFSheet sheet = workbook.getSheet("Товары");
            if (sheet == null) {
                System.out.println("Такого листа нет! Исправьте ошибки и запустите программу заново!");
                return;
            }

            for (Row row : sheet) {
                for (Cell cell : row) System.out.print(cell.toString() + "\t");
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("С файлом что-то не так! Исправьте ошибки и запустите программу заново!");
        }
    }
}