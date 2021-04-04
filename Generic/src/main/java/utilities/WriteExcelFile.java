package utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {

    private static final String FILE_NAME = System.getProperty("user.dir") + "/DataTest/TestExcelFile.xlsx";
    //private static final String FILE_NAME = "DataTest/myFile.xlsx";

    static int min = 0;
    static int max = 100;

    static int random_integer = (int) (Math.random() * (max - min + 1) + min);
    static String email =   "2021" + random_integer + "dingdong"+ "@yahoo.com";
    static String password =   "TesTPassWord" + random_integer ;

    public static void writeExcel(String fileName) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("WalmartReg");
        Object[][] stDetails = {
                {"firstName", "lastName", "email", "password"},
                { "Ting", "Tong", email,password},

        };
        int rowNum = 0;
        System.out.println("Excel file Created");
        for (Object[] std : stDetails) {
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
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
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
