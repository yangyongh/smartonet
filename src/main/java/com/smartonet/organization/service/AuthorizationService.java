package com.smartonet.organization.service;

import com.smartonet.organization.dto.AuthorizationExecution;
import com.smartonet.organization.entity.User;

/**
 * 用户验证业务处理类
 * @author yongh.yang
 */
public interface AuthorizationService {
	
	public AuthorizationExecution isAuthorizedUser(User user);
	
}
