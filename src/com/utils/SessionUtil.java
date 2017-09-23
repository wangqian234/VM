package com.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionUtil {
	
	public static String getOpenid(HttpServletRequest request){
		HttpSession session = request.getSession();
		String openid = (String) session.getAttribute("openid");
		return openid;
		
	}

}
