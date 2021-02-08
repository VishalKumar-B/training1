package com.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OneMapper implements RowMapper<One>{

	@Override
	public One mapRow(ResultSet rs, int rowNum) throws SQLException {
		One one = new One();
		one.setId(rs.getInt(1));
		one.setName(rs.getString(2));
		return one;
	}

}
