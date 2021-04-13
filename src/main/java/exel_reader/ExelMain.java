package exel_reader;
	
import java.io.IOException;
import java.util.*;

public class ExelMain {
    int a =1;
    int b =1;
    int c =1;
    public static void main(String...args) throws InterruptedException, IOException {
//        System.out.println("Hello Git");
//        ExelTime.timeWork();
//        ExelDataTypes.dataTypes();
//        Workbook workbook = WorkbookFactory.create(new File("c:/temp/tempCREATE.xls"));
        System.out.println(new ExelMain().printSome(2));

    }
    public double printSome(long x){
        return a*Math.pow(x, 2)+b*x+c;
    }
}
