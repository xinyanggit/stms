package com.iris.test.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository("testJqueryAndPluginDao")
public class TestJqueryAndPluginDao {
	@Resource
	private JdbcTemplate jdbcTemplate;
	@Resource
	private HibernateTemplate hibernateTemplate;

}
