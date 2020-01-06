import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateSheet {

	
	public static void main(String[] args) throws Exception {
	    Workbook wb = new XSSFWorkbook(); //or new HSSFWorkbook();
	    Sheet sheet = wb.createSheet("Sheet1");
	    Row row = sheet.createRow(0);
//	    row.setHeightInPoints(30);
//	    createCell(wb, row, 0, HorizontalAlignment.CENTER, VerticalAlignment.BOTTOM);
//	    createCell(wb, row, 1, HorizontalAlignment.CENTER_SELECTION, VerticalAlignment.BOTTOM);
	    
	    createCellUn(wb, row, 0);
	    createCellPwd(wb, row, 1);
	    
	    
	     row = sheet.createRow(1);
	    
	    createCellStr(wb, row, 0, "seconduser@facebook.com");
	    createCellStr(wb, row, 1, "secondpass");
	    
	    // Write the output to a file
	    try (OutputStream fileOut = new FileOutputStream("C:\\Users\\jerin\\Desktop\\TestExl1.xlsx")) {
	        wb.write(fileOut);
	    }
	    wb.close();
	}
	/**
	 * Creates a cell and aligns it a certain way.
	 *
	 * @param wb     the workbook
	 * @param row    the row to create the cell in
	 * @param column the column number to create the cell in
	 * @param halign the horizontal alignment for the cell.
	 * @param valign the vertical alignment for the cell.
	 */
	private static void createCell(Workbook wb, Row row, int column, HorizontalAlignment halign, VerticalAlignment valign) {
	    Cell cell = row.createCell(column);
	    cell.setCellValue("Align It");
	    CellStyle cellStyle = wb.createCellStyle();
	    cellStyle.setAlignment(halign);
	    cellStyle.setVerticalAlignment(valign);
	    cell.setCellStyle(cellStyle);
	}

	
	private static void createCellUn(Workbook wb, Row row, int column) {
	    Cell cell = row.createCell(column);
	    cell.setCellValue("username@gmail.com");
	}
	
	private static void createCellPwd(Workbook wb, Row row, int column) {
	    Cell cell = row.createCell(column);
	    cell.setCellValue("test123");
	}
	
	private static void createCellStr(Workbook wb, Row row, int column, String str) {
	    Cell cell = row.createCell(column);
	    cell.setCellValue(str);
	}
	
}
