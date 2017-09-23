package com.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mvc.dao.impl.SqlConDao;

//import org.springframework.stereotype.Service;

import com.mvc.service.SqlConService;

//@Service("sqlConServiceImpl")
public class SqlConServiceImpl implements SqlConService {
	@Autowired
	SqlConDao sqlConDao;
	
	@Override
	public List<Object> selectSqlContest() {
		List<Object> list = null;
		//List<Object> list = sqlConDao.selectSqlContest();
		return list;
	}

}
