package exel_reader;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.util.Calendar;
import java.util.Date;

public class ExelTime {
    public static void timeWork(){
        int rowIndex = 0;
        int cellIndex = 0;
        int data = 0;
        HSSFWorkbook workbook = new HSSFWorkbook();
        CreationHelper creationHelper = workbook.getCreationHelper();
        Sheet sheet = workbook.createSheet("1");
        for (; rowIndex < 3; rowIndex++) {
            Row row = sheet.createRow(rowIndex);
            for (int j = 0; j < 10; j++) {
                row.createCell(j).setCellValue(data++);
            }
        }

        Row row = sheet.createRow(rowIndex++);
        row = sheet.createRow(rowIndex++);

        Cell cell = row.createCell(cellIndex++);
        cell.setCellValue(new Date());

        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setDataFormat(creationHelper.createDataFormat().getFormat("m/d/yy h:mm"));

        cell = row.createCell(cellIndex++);
        cell.setCellValue(new Date());
        cell.setCellStyle(cellStyle);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) { e.printStackTrace(); }

        Cell cell2 = row.createCell(cellIndex++);
        cell2.setCellValue(Calendar.getInstance());
        cell2.setCellStyle(cellStyle);





        new ExelWriter(workbook).write("c:/temp/tempTIME.xls");
    }
}
