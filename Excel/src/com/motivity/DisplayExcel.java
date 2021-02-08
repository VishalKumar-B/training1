package com.motivity;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

public class DisplayExcel {

	public static final String MM_DD_YYYY = "MM/dd/yyyy";

	public static void main(String... args) throws IOException, ClassNotFoundException, SQLException {

		FileInputStream file = new FileInputStream(new File("C:\\Users\\Home\\Downloads\\File.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();
		//rowIterator.next();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			System.out.println();
			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				int cellType = cell.getCellType();

				try {
					determineValue(cellType, cell);
				} catch (UnsupportedOperationException ex) {
					System.out.println(ex.getMessage());
				}
			}
		}
	}

	public static void determineValue(int cellType, Cell cell) {
		switch (cellType) {
		case Cell.CELL_TYPE_NUMERIC:
			determineDate(cell);
			break;
		case Cell.CELL_TYPE_STRING:
			System.out.print(cell.getStringCellValue() + "\t\t");
			break;
		default:
			throw new UnsupportedOperationException("This type of cell should be additionally implemented");
		}
	}

	private static void determineDate(Cell cell) {
		short dataFormat = cell.getCellStyle().getDataFormat();

		if (14 == dataFormat) {
			Date dateCellValue = cell.getDateCellValue();
			System.out.print(new SimpleDateFormat(MM_DD_YYYY).format(dateCellValue) + "\t\t");

		} else {
			System.out.print(new DataFormatter().formatCellValue(cell) + "\t\t");

		}
	}
}