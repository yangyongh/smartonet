package com.smartonet.frame.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.smartonet.organization.entity.User;

public class ControlInterceptor implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {

	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		
		//请求
		String uri = request.getRequestURI() ;
		//登录请求过滤掉，直接访问对应controller
		if(uri.startsWith("/login")){
			return true ;
		}
		
		//从Session中获取用户信息
		User user = (User)request.getSession().getAttribute("user");
		//如果获取用户信息失败，将界面重定向到login.jsp界面
        if (user == null) {
        	request.getRequestDispatcher("login.jsp").forward(request,response);
        	return false ;
        }
        return true;
	}
}
