package com.iris.test.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iris.test.dao.TestJqueryAndPluginDao;

@Service("testJqueryAndPluginService")
@Transactional(rollbackFor = Exception.class)
public class TestJqueryAndPluginServiceImpl implements ITestJqueryAndPluginService {

	@Resource(name = "testJqueryAndPluginDao")
	private TestJqueryAndPluginDao testJqueryAndPluginDao;

}
