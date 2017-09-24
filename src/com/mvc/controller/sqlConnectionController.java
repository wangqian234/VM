package com.mvc.controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.base.constants.database;


@Controller
@RequestMapping("/sqlCon")
public class sqlConnectionController {
	

	@RequestMapping("/sqlConTest.do")
	public @ResponseBody String sqlConnectionTest(){
		System.out.println("jinlaila");
		String list = null;
		try
		{
		   Class.forName(database.DRIVERCLASSNAME);
		   Connection dbConn=DriverManager.getConnection(database.URL,database.USERNAME,database.PASSWORD);
		   Statement stmt=dbConn.createStatement();
		   String sql="select  TOP 10  * from [gywygl].[dbo].[Detector_Equipment] ;";
		   ResultSet rs=stmt.executeQuery(sql);
		   while(rs.next()){
			   System.out.println(rs.getRow());
			   list=rs.getString("Detector_Equipment_No");
			   list+=rs.getString("Detector_Equipment_Name");
			   continue;
		   }
		   System.out.println(list);
		    System.out.println("连接数据库成功");
		    dbConn.close();
		    stmt.close();
		    rs.close();
		  }
		  catch(Exception e)
		  {
		   e.printStackTrace();
		   System.out.print("连接失败");
		  }
		return list;
		
	}
	
	
}
