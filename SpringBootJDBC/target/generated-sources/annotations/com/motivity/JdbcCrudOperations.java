package com.motivity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;

@Repository
public class JdbcCrudOperations {

	Scanner sc = new Scanner(System.in);

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert() {
		final Student student = new Student();

		System.out.println("enter student id: ");
		student.setId(sc.nextInt());
		System.out.println("enter student name: ");
		student.setName(sc.next());
		System.out.println("enter student marks");
		student.setMarks(sc.nextInt());

		boolean b = jdbcTemplate.execute("insert into student values(?,?,?)", new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, student.getId());
				ps.setString(2, student.getName());
				ps.setInt(3, student.getMarks());
				return ps.execute();
			}
		});
		if (!b)
			System.out.println("inserted");
		else
			System.out.println("failed");
	}

	public void display() {
		List<Student> li = jdbcTemplate.query("select * from student", new RowMapper<Student>() {
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setMarks(rs.getInt(3));
				return student;
			}
		});
		for (Student s : li) {
			System.out.println("id:" + s.getId() + " " + "name:" + s.getName() + " " + "marks:" + s.getMarks());
		}
	}

	public void update() {
		Student student = new Student();
		System.out.println("enter student id to update student marks: ");
		student.setId(sc.nextInt());
		System.out.println("enter updated marks: ");
		student.setMarks(sc.nextInt());
		String query = "update student set marks=? where id=?";
		int i = jdbcTemplate.update(query, student.getMarks(), student.getId());
		if (i > 0)
			System.out.println("updated");
		else
			System.out.println("failed");
	}

	public void delete() {
		Student student = new Student();
		System.out.println("enter student id that you want to delete");
		student.setId(sc.nextInt());
		String query = "delete from student where id=?";
		int i = jdbcTemplate.update(query, student.getId());
		if (i > 0)
			System.out.println("deleted");
		else
			System.out.println("failed");
	}

}
