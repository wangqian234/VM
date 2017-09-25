package com.mvc.controller;

<<<<<<< HEAD
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
=======
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
>>>>>>> 398ee7cd106ad12737b263d6abe7c266a95f7f8b
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.mvc.entityReport.User;
import com.utils.OpenidUtil;

/**
 * 路由跳转相关
 * 
 * @author
 * @date 2017年8月9日
 */
@Controller
@RequestMapping("/baseInfoController")
public class baseInfoController extends HttpServlet {

	
    @RequestMapping("/selectBaseList.do")
    public String toEvalPage(){
    	
    	System.out.println("asdasdasd");
    	return "1baseInfo/index";
    }
=======
import org.springframework.web.bind.annotation.ResponseBody;

import com.base.constants.database;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/baseInfo")
public class baseInfoController {

	/**
	 * 获取设备运行状态信息
	 * request：project、facility
	 * return：设备状态、设备信息
	 * 
	 * */
	@RequestMapping("/getBaseInfo.do")
	public @ResponseBody String getBaseInfo(HttpServletRequest request, HttpSession session){
		String project = request.getParameter("project");
		String facility = request.getParameter("facility");
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<String, String>();
		JSONObject jsonObject = new JSONObject();
		//TODO
		try
		{
			Class.forName(database.DRIVERCLASSNAME);
			Connection dbConn=DriverManager.getConnection(database.URL,database.USERNAME,database.PASSWORD);
			Statement stmt=dbConn.createStatement();
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT [gywygl].[dbo].[Detector_EquipmentRoom].[Detector_EquipmentRoom_Name],[gywygl].[dbo].[Detector_Equipment].[Detector_Equipment_Name], ");
			sql.append("[gywygl].[dbo].[Detector_Sensor].[Detector_Sensor_Name],[gywygl].[dbo].[Detector_SensorData].[Detector_SensorData_Value], ");
			sql.append("[gywygl].[dbo].[Detector_SensorData].[Detector_SensorData_Time],[gywygl].[dbo].[Detector_Sensor].[Detector_Sensor_Type] FROM  ");
			sql.append("[gywygl].[dbo].[Detector_SensorData] LEFT JOIN ");
			sql.append("[gywygl].[dbo].[Detector_Sensor] ON  [gywygl].[dbo].[Detector_SensorData].[Detector_Sensor_Id] = ");
			sql.append("[gywygl].[dbo].[Detector_Sensor].[Detector_Sensor_Id] LEFT JOIN [gywygl].[dbo].[Detector_Equipment] ON ");
			sql.append("[gywygl].[dbo].[Detector_Equipment].[Detector_Equipment_Id] = [gywygl].[dbo].[Detector_Sensor].[Detector_Equipment_Id] LEFT JOIN");
			sql.append("[gywygl].[dbo].[Detector_EquipmentRoom] on [gywygl].[dbo].[Detector_Equipment].[Detector_EquipmentRoom_Id] = ");
			sql.append("[gywygl].[dbo].[Detector_EquipmentRoom].[Detector_EquipmentRoom_Id] LEFT JOIN [gywygl].[dbo].[Detector_Facility] ON ");
			sql.append("[gywygl].[dbo].[Detector_Facility].[Detector_Facility_Id] = [gywygl].[dbo].[Detector_EquipmentRoom].[Detector_Facility_Id] LEFT JOIN");
			sql.append("[gywygl].[dbo].[Detector_Project] ON [gywygl].[dbo].[Detector_Project].[Detector_Project_Id] = ");
//			sql.append("[gywygl].[dbo].[Detector_EquipmentRoom].[Detector_Project_Id] WHERE [gywygl].[dbo].[Detector_Facility].[Detector_Facility_Id] = '"+facility+"'");
//			sql.append(" AND [gywygl].[dbo].[Detector_Project].[Detector_Project_Id] = '"+project+"';");
			sql.append("[gywygl].[dbo].[Detector_EquipmentRoom].[Detector_Project_Id] WHERE [gywygl].[dbo].[Detector_Facility].[Detector_Facility_Id] = 1");
			sql.append(" AND [gywygl].[dbo].[Detector_Project].[Detector_Project_Id] = 1;");
			ResultSet rs=stmt.executeQuery(sql.toString());
			System.out.println(rs.getRow());
			while(rs.next()){
				map.put("Detector_EquipmentRoom_Name", rs.getObject("Detector_EquipmentRoom_Name").toString());
				map.put("Detector_Equipment_Name", rs.getObject("Detector_Equipment_Name").toString());
				map.put("Detector_Sensor_Name", rs.getObject("Detector_Sensor_Name").toString());
				map.put("Detector_SensorData_Value", rs.getObject("Detector_SensorData_Value").toString());
				map.put("Detector_SensorData_Time", rs.getObject("Detector_SensorData_Time").toString());
				map.put("Detector_Sensor_Type", rs.getObject("Detector_Sensor_Type").toString());
				list.add(map);
				continue;
			}
			System.out.println(list);
			dbConn.close();
			stmt.close();
			rs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.print("连接失败");
		}
		
		//首先判断Detector_Sensor_Type是否为状态值:1为运行状态信息、2为报警信息
		for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(i).get("Detector_Sensor_Type") == "2"){
				jsonObject.put(list.get(i).get("Detector_Equipment_Name"), list.get(i));
				list.remove(i);
				break;
			};
		}
		jsonObject.put(list.get(0).get("Detector_Equipment_Name"), list);
		
		return jsonObject.toString();
	}
>>>>>>> 398ee7cd106ad12737b263d6abe7c266a95f7f8b
}
