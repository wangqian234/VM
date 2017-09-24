package com.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.mvc.entityReport.User;
import com.mvc.service.BusNeedService;
import com.utils.OpenidUtil;

/**
 * 路由跳转相关
 * 
 * @author
 * @date 2017年8月9日
 */
@Controller
@RequestMapping("/routeController")
public class RouteController extends HttpServlet {
	@Autowired
	BusNeedService busNeedService;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static HttpSession getSession() {
		HttpSession session = null;
		try {
			session = getRequest().getSession();
		} catch (Exception e) {
		}
		return session;
	}

	public static HttpServletRequest getRequest() {
		ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		return attrs.getRequest();
	}

	@RequestMapping("/toPage.do")
	public String toPage() {
		busNeedService.selectContent();
		return "test/index";
	}

	@RequestMapping("/toTestPage.do")
	public String toBusNeedPage() {
		return "test/index";
	}

}
