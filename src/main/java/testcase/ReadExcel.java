package testcase;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ReadExcel {
    public  static void main(String args[]) throws IOException {
        //step:1 set up workbook path
        XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLeadData.xlsx");
        //STEP2:get into the worksheet
        XSSFSheet ws = wb.getSheet("Sheet1");
        int rows=ws.getLastRowNum();
        System.out.println(rows);
        //step3:get into the row;row index starts from 0
       // XSSFRow row=ws.getRow(rows);
        int cells=ws.getRow(0).getLastCellNum();
        //declare 2d array
        String[][] data=new String[rows][cells];
        System.out.println(cells);
        for(int i=1;i<=rows;i++){
            for(int j=0;j<cells;j++){
                String value=ws.getRow(i).getCell(j).getStringCellValue();
                System.out.println(value);
                //data[i-1][j]=value;
            }

        }
        wb.close();




    }

}
