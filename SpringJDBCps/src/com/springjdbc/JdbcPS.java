package com.springjdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class JdbcPS {

	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(One one) {
		boolean b = jdbcTemplate.execute("insert into one values(?,?)", new PreparedStatementCallback<Boolean>() {

			@Override
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

	public void selectPsCallback() {
		List<One> li = jdbcTemplate.query("select * from one", new ResultSetExtractor<List<One>>() {

			@Override
			public List<One> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<One> list = new ArrayList<>();
				while (rs.next()) {
					One one = new One();
					one.setId(rs.getInt(1));
					one.setName(rs.getString(2));
					list.add(one);
				}

				return list;
			}

		});

		for (One o : li) {
			System.out.println("id:" + o.getId() + " " + "name:" + o.getName());
		}
	}

	public void selectPsRowMapper() {
		List<One> li = jdbcTemplate.query("select * from one", new RowMapper<One>() {

			@Override
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
	
}


/*
 * ResultSetExtractor is suppose to extract the whole ResultSet (possibly
 * multiple rows), while RowMapper is feeded with row at a time
 * for resultset extractor we need to add collection but row mapper it is not necessary
 */
