package exel_reader;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExelWriter {
    private Workbook workbook;

    public ExelWriter(XSSFWorkbook workbook) {
        this.workbook = workbook;
    }

    public ExelWriter(HSSFWorkbook workbook) {
        this.workbook = workbook;
    }

    public void write(String file) {
        try {
            OutputStream fileOut = new FileOutputStream(file);
            workbook.write(fileOut);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
