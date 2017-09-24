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
@RequestMapping("/baseInfoController")
public class baseInfoController extends HttpServlet {

	
    @RequestMapping("/selectBaseList.do")
    public String toEvalPage(){
    	
    	System.out.println("asdasdasd");
    	return "1baseInfo/index";
    }
}
