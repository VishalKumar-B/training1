package com.motivity.FirstMaven;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

public class JdbcCrudOperatios {

	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void select() {
		List<One> li = jdbcTemplate.query("select * from one", new RowMapper<One>() {

			public One mapRow(ResultSet rs, int rowNum) throws SQLException {
				One o = new One();
				o.setId(rs.getInt(1));
				o.setName(rs.getString(2));
				return o;
			}

		});
	
	for(One one : li) {
		System.out.println("id:" + one.getId() + " " + "name:" + one.getName());
	}
	}
	
	public void insert(final One one) {
		boolean b = jdbcTemplate.execute("insert into one values(?,?)", new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, one.getId());
				ps.setString(2, one.getName());
				return ps.execute();
			}
		});
		if (!b)
			System.out.println("inserted");
		else
			System.out.println("failed");
	}
	
	
	public void update(One one) {
		String query = "update one set name=? where id=?";
		
		int i = jdbcTemplate.update(query, one.getName(),one.getId());
		
		if (i > 0)
			System.out.println("updated");
		else
			System.out.println("failed");
	}
	
	public void delete(One one) {
		
		String query = "delete from one where id=?";
		int i = jdbcTemplate.update(query, one.getId());
		
		if (i > 0)
			System.out.println("deleted");
		else
			System.out.println("failed");
	}
}
