package com.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/test")
public class AjaxTestController {
	@RequestMapping("/ajaxTest.do")
	public @ResponseBody String jspay(HttpServletRequest request, HttpServletResponse response){
		JSONObject json = new JSONObject();
		json.put("list", "wang123");
		json.put("list1", "wang123");
		json.put("list2", "wang123");
		json.put("package", "123ya");
		return json.toString();
	}

}
