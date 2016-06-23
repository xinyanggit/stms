package com.iris.test.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("test1Dao")
public class Test1Dao {

	/*@Resource
	private JdbcTemplate jdbcTemplate;*/

	/*@Resource
	private HibernateTemplate hibernateTemplate;*/

	public List findAll() {
		/*System.out.println("persistance begin...");
		int resultCount=jdbcTemplate.update("update person t set t.cname='test' where t.psn_code='88888888'");
		List list=hibernateTemplate.find("from Test1Form");*/
		return null;
	}
}
