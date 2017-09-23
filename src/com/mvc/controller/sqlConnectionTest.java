package com.mvc.controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.service.SqlConService;

@Controller
@RequestMapping("/sqlCon")
public class sqlConnectionTest {

	@Autowired
	SqlConService  sqlConService;
	
	@SuppressWarnings("unused")
	@RequestMapping("/sqlConTest.do")
	public @ResponseBody String sqlConnectionTest(){
		System.out.println("jinlaila");
		List<Object> list;
		list = sqlConService.selectSqlContest();
		
		
		return null;
		
	}
	
	
}
