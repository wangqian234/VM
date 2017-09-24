package com.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/routeController")
public class RouteController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
     
    @RequestMapping("/toLoginPage.do")
 	public String toLoginPage() {
 		return "index";
 	}
    
    @RequestMapping("/toTestPage.do")
    public String toTestPage() {
 		return "1baseInfo/index";
 	}
    @RequestMapping("/toOperaPage.do")
    public String toOperaPage(){
    	return "2operaState/index";
    }
    @RequestMapping("/toErrorPage.do")
    public String toErrorPage(){
    	return "3errorState/index";
    }
    @RequestMapping("/toPrePage.do")
    public String toPrePage(){
    	return "4preMain/index";
    }
    @RequestMapping("/toEvalPage.do")
    public String toEvalPage(){
    	return "5evalState/index";
    }
}
