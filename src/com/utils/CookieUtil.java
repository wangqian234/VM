/**
 * 
 */
package com.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Cookie
 * 
 * @author zjn
 * @date 2016年9月9日
 */
public class CookieUtil {

	/* 添加一个cookie */
	public void add_cookie(String cookie_name, String cookie_value, HttpServletResponse res, int time) {
		Cookie ph_cookie = new Cookie(cookie_name, cookie_value);
		ph_cookie.setMaxAge(time);
		res.addCookie(ph_cookie);
	}

	/* 删除一个cookie */
	public void del_cookie(String cookie_name, HttpServletRequest req, HttpServletResponse res) {
		Cookie myCookie[] = req.getCookies();
		if (myCookie != null) {
			for (Cookie cookie : myCookie) {
				if (cookie_name.equals(cookie.getName())) {
					cookie.setMaxAge(0);
					res.addCookie(cookie);
				}
			}
		}
	}

	/* 获取Cookie内容 */
	public String get_cookie(String cookie_name, HttpServletRequest req) {
		Cookie myCookie[] = req.getCookies();
		if (myCookie != null) {
			for (Cookie cookie : myCookie) {
				if (cookie_name.equals(cookie.getName())) {
					return cookie.getValue();
				}
			}

		}
		return "";
	}

	/* 返回导出成功标记的cookie */
	public static Cookie exportFlag() {
		Cookie cookie = new Cookie("exportFlag", "1");
		cookie.setMaxAge(30 * 60);
		cookie.setPath("/");
		return cookie;
	}
}
