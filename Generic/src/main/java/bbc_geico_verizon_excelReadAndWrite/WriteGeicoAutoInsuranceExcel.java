package bbc_geico_verizon_excelReadAndWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteGeicoAutoInsuranceExcel {
    static int min = 50;
    static int max = 100;
    //Generate random integer value from 50 to 100
    static int random_integer = (int) (Math.random() * (max - min + 1) + min);
    static String email = "yinyan" + random_integer + "@gmail.com";

    public static void geicoWriteExcel(String fileName) {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("GeicoRegistrationAccountInfo");
            Object[][] accountDetails = {
                    { "DateOfBirth","FirstName","LastName","Address","Apt#","Email", "Password"},
                    { "12311985", "Moni","Hashem","1123 Elmont Ave","20" ,email,"ABcDe123"},
                    { "713194", "Samantha","Brooke","1123 Elmont Ave","21", email ,"ABcDe123"},
                    { "6151989", "Ilium","Alihandra","1123 Elmont Ave","23", email,"ABcDe123"},

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
