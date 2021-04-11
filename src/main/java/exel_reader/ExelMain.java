package exel_reader;

import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

public class ExelMain {
    public static void main(String...args) throws InterruptedException, IOException {
//        ExelTime.timeWork();
//        ExelDataTypes.dataTypes();
//        Workbook workbook = WorkbookFactory.create(new File("c:/temp/tempCREATE.xls"));
        System.out.println(printSome(5, 15));

    }
    public static long printSome(long x, long y){
            if(x==y){/*DO NOTHING*/
            }else{
                for(long i= x+1; i<=y; i++){
                    x=x*i;
                }
            }
            return x;
    }
}
