package com.iris.test.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iris.test.dao.Test1Dao;

import javax.annotation.Resource;

@Service("test1Service")
@Transactional(rollbackFor=Exception.class)
public class Test1ServiceImpl implements ITest1Service {

	@Resource(name="test1Dao")
	private Test1Dao test1Dao;
	
	public List findAll() {
		
		System.out.println("service begin...");
		
		return test1Dao.findAll();
	}
	
}
