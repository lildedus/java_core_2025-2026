package lr10.task4;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelParser {
    public static void main(String[] args) {
        String filePath = "src/lr10/task4/data.xlsx";
        String sheetName = "Лист1";
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("Ошибка: Файл не найден - " + file.getAbsolutePath());
            System.out.println("Создайте файл " + filePath + " с листом '" + sheetName + "'");
            return;
        }
        try (FileInputStream fis = new FileInputStream(file);
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                System.out.println("Ошибка: Лист '" + sheetName + "' не найден в файле");
                System.out.println("Доступные листы:");
                for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                    System.out.println("  - " + workbook.getSheetName(i));
                }
                return;
            }
            for (Row row : sheet) {
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING: System.out.print(cell.getStringCellValue() + "\t"); break;
                        case NUMERIC: System.out.print(cell.getNumericCellValue() + "\t"); break;
                        default: System.out.print("?\t");
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            System.out.println("Проверьте, что файл не поврежден и имеет формат .xlsx");
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e.getMessage());
        }
    }
}