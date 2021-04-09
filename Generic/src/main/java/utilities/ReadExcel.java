package utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class ReadExcel {

    private static final String FILE_NAME = System.getProperty("user.dir") + "/DataTest/TestExcelFile.xlsx";

    /**
     * This method is to read Excel file based on sheet Index Number
     */
    public static void readExcelFile(String fileName, int sheetNumber) {
        try {
            FileInputStream inputStream = new FileInputStream(new File(fileName));
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet dataTypeSheet = workbook.getSheetAt(sheetNumber);

            Iterator<Row> rowIterator = dataTypeSheet.iterator();
            while (rowIterator.hasNext()) {
                Row currentRow = rowIterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();

                    if (currentCell.getCellType() == CellType.STRING) {
                        System.out.print(currentCell.getStringCellValue() + " ");

                    } else if (currentCell.getCellType() == CellType.NUMERIC) {
                        System.out.print(currentCell.getNumericCellValue());
                    }
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found Exception");

        } catch (IOException e1) {
            e1.printStackTrace();
            System.out.println("Input Output Exception");
        }

    }

    @Test
    public void searchOnBBCUsingExcelData() throws IOException, InterruptedException {
//        path = new File("../File_Cabinet/BBCHeadLists.xlsx");  (File path, int sheetIndex)
        File path = new File("../File_Cabinet/BBCHeadLists.xlsx");
        FileInputStream input = new FileInputStream(path);
        Workbook book = WorkbookFactory.create(input);
        Sheet sheet = book.getSheetAt(0);
        for (Row row : sheet) {
            for (Cell cell : row) {
                if (cell.getCellType() == CellType.STRING) {
                    cell.getStringCellValue();
                } else if ((cell.getCellType() == CellType.NUMERIC)) {
                    cell.getNumericCellValue();
                } else if ((cell.getCellType() == CellType.BLANK)) {
                    cell.getCellStyle();// not sure
                }

            }
        }

    }
}



