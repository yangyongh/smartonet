package com.smartonet.organization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartonet.organization.dao.UserDAO;
import com.smartonet.organization.dto.AuthorizationExecution;
import com.smartonet.organization.dto.UserProfile;
import com.smartonet.organization.entity.User;
import com.smartonet.organization.enums.AuthResultEnum;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {
	
	@Autowired
	private UserDAO userdao ;

	public AuthorizationExecution isAuthorizedUser(User user) {
		//验证用户是否是授权用户，设计异常错误 TODO 
		if(user == null){
			return new AuthorizationExecution("User's name is null!",AuthResultEnum.UNREGISTERED) ;
		}
		//数据查询用户是否存在
		UserProfile db_user = userdao.getUserProfileByName(user.getName());
		if(db_user == null || db_user.getUserId()<0){
			return new AuthorizationExecution(user.getName(),AuthResultEnum.UNREGISTERED) ;
		}
		
		//验证密码是否正确
		if(db_user.getPassword().equals(user.getPassword())){
			return new AuthorizationExecution(user.getName(),AuthResultEnum.PASS) ;
		}else{
			return new AuthorizationExecution(user.getName(),AuthResultEnum.WRONGPWD) ;
		}
	}
}
