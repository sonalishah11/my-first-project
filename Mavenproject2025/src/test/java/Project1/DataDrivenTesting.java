package Project1;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class DataDrivenTesting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\.metadata\\.plugins\\Mavenproject2025\\Testdata\\testdoc.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int totalRows = sheet.getLastRowNum();
        int totalCells = sheet.getRow(0).getLastCellNum(); // use 0 if you want first row's cells

        System.out.println("Total number of rows: " + totalRows);
        System.out.println("Total number of cells: " + totalCells);

		
		
	}

}
