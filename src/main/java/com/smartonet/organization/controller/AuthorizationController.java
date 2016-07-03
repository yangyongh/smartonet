package com.smartonet.organization.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartonet.frame.json.SmartoNetResult;
import com.smartonet.organization.dto.AuthorizationExecution;
import com.smartonet.organization.entity.User;
import com.smartonet.organization.enums.AuthResultEnum;
import com.smartonet.organization.service.AuthorizationService;

@Controller
public class AuthorizationController {
	
	@Autowired
	private AuthorizationService authorizationService ;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/login",method = RequestMethod.POST)
	@ResponseBody
	public SmartoNetResult<AuthorizationExecution> login(HttpServletRequest request,HttpServletResponse response,User user){
		//用户验证
		AuthorizationExecution execution = authorizationService.isAuthorizedUser(user);
		logger.info("User named {} : {}",user.getName(),execution.getStateInfo());
		if(execution.getState() == AuthResultEnum.PASS.getState()){
			try {
				request.getRequestDispatcher("WEB-INF/pages/main.jsp").forward(request,response);
			} catch (ServletException e) {
				logger.error(e.getMessage(),e);
				return new SmartoNetResult<AuthorizationExecution>(false,execution);
			} catch (IOException e) {
				logger.error(e.getMessage(),e);
				return new SmartoNetResult<AuthorizationExecution>(false,execution);
			}
		}
		return new SmartoNetResult<AuthorizationExecution>(true,execution);
	}
	
	@RequestMapping(value = "/logout")
	public String logout(HttpServletRequest request,HttpServletResponse response,User user){
		
		request.getSession().invalidate();
		
		return "success" ;
	}
}
