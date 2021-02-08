package com.springjdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcSelect {

	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	 
	public void selectRecords() {
		List li = jdbcTemplate.queryForList("select * from one");
		for(Object o : li) {
			System.out.println(o.toString());
		}
	}
	
	public void updateRecords(One one) {
		int i = jdbcTemplate.update("update one set name='"+one.getName()+"' where id='"+one.getId()+"'");
		if(i>0)
			System.out.println("updated");
		else
			System.out.println("failed");
	}
	
	public void deleteRecords(One one) {
		int i = jdbcTemplate.update("delete from one where id='"+one.getId()+"'");
		if(i>0)
			System.out.println("deleted");
		else
			System.out.println("failed");
	}

	public void insertRecords(One one) {
		int i = jdbcTemplate.update("insert into one values('"+one.getId()+"','"+one.getName()+"')");
		if(i>0)
			System.out.println("inserted");
		else
			System.out.println("failed");
	}
	
	public void select() {
		List<One> li = jdbcTemplate.query("select * from one", new OneMapper());
		for(One o : li) {
			System.out.println("id: " +o.getId()+"  "+ "name: " +o.getName());
		}
	}
}
