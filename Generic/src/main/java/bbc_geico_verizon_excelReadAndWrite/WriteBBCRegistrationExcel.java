package bbc_geico_verizon_excelReadAndWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBBCRegistrationExcel {
    private static final String FILE_NAME = "C:\\Users\\israt\\IdeaProjects\\WebAutomationFramework_Team2\\ExcelData\\BBCRegister.xlsx";

    public static void writeExcel() {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("BBCRegistrationAccountInfo");
        Object[][] accountDetails = {
                { "BirthDay","BirthMonth","BirthYear","Email", "Password"},
                { "24", "12","1987", "yinexer598@990ys.com","ABcDe123"},
                { "13", "6","1980", "isratretomoni@gmail.com","ABcDe123"},

        };
        int rowNum = 0;
        System.out.println("Excel file Created");
        for (Object[] std : accountDetails) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : std) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
            workbook.write(fileOutputStream);
            workbook.close();

        } catch (FileNotFoundException e) {
            //System.out.println("File not found Exception");
            e.printStackTrace();

        } catch (IOException io) {
            io.printStackTrace();
        }
        System.out.println("Done");
    }


}
