package com.motivity;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InsertExcel {

	public static void main(String[] args) throws Exception {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/motivity", "root",
					"root");
			PreparedStatement pstm = null;
			con.setAutoCommit(false);
			FileInputStream input = new FileInputStream("C:\\Users\\Home\\Downloads\\File.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(input);
			XSSFSheet sheet = wb.getSheetAt(0);
			Row row;
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				row = (Row) sheet.getRow(i);
				int sno = (int) row.getCell(0).getNumericCellValue();
				String date = row.getCell(1).getStringCellValue();
				// String time = String.valueOf(row.getCell(2).getNumericCellValue());
				
				java.util.Date datetime = row.getCell(2).getDateCellValue();
				java.sql.Time time = new java.sql.Time(datetime.getTime());
				
				String location = String.valueOf(row.getCell(3).getNumericCellValue());
				String status = row.getCell(4).getStringCellValue();
				String alarm = row.getCell(5).getStringCellValue();

				String sql = "insert into excel(sno,date,time,location_id,status,alarm) values('" + sno + "','" + date + "','" + time + "','" + location + "','" + status + "','" + alarm + "') ";
				pstm = (PreparedStatement) con.prepareStatement(sql);
				pstm.executeUpdate();
				System.out.println("Inserted row " + i);
			}

			con.commit();
			pstm.close();
			con.close();
			input.close();
			System.out.println("Successfully inserted excel into table");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}