package com.springjdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class JdbcNP {

	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	public void insert(One one) {

		Map<String, Object> map = new HashMap<>();
		map.put("id", one.getId());
		map.put("name", one.getName());

		String query = "insert into one values(:id,:name)";

		Object obj = namedParameterJdbcTemplate.execute(query, map, new PreparedStatementCallback<Object>() {

			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				Object o = ps.execute();
				return o;
			}

		});
		if (obj != null)
			System.out.println("inserted");
		else
			System.out.println("failed");
	}

	public void select() {
		List<One> li = namedParameterJdbcTemplate.query("select * from one", new RowMapper<One>() {

			@Override
			public One mapRow(ResultSet rs, int rowNum) throws SQLException {
				One o = new One();
				o.setId(rs.getInt(1));
				o.setName(rs.getString(2));
				return o;
			}

		});

		for (One one : li) {
			System.out.println("id:" + one.getId() + " " + "name:" + one.getName());
		}
	}

	public void update(One one) {
		String query = "update one set name= :name where id= :id";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", one.getId());
		map.put("name", one.getName());
		int i = namedParameterJdbcTemplate.update(query, map);
		if (i > 0)
			System.out.println("updated");
		else
			System.out.println("failed");
	}

}
