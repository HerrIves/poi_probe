package exel_reader;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.Calendar;
import java.util.Date;

public class ExelDataTypes {
    private static int rowCounter = 0;
    private static int cellCounter = 0;
    public static void dataTypes(){

        XSSFWorkbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("one");
        Row row = sheet.createRow(rowCounter++);
        row.createCell(cellCounter++).setCellValue(1.1);
        row.createCell(cellCounter++).setCellValue(new Date());
        row.createCell(cellCounter++).setCellValue(Calendar.getInstance());
        row.createCell(cellCounter++).setCellValue("a String");
        row.createCell(cellCounter++).setCellValue(true);
        row.createCell(cellCounter++).setCellType(CellType.ERROR);

        new ExelWriter(workbook).write("c:/temp/tempDATA.xlsx");

    }
}
