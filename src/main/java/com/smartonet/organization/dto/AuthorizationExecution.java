package com.smartonet.organization.dto;

import com.smartonet.organization.enums.AuthResultEnum;

/**
 * 用户验证执行结果
 * @author Li
 *
 */
public class AuthorizationExecution {

	/**
	 * 验证用户的登录名
	 */
	private String name ;
	/**
	 * 状态
	 */
	private int state ;
	//状态信息
	private String stateInfo ;

	public AuthorizationExecution(String name,AuthResultEnum authResultEnum) {
		super();
		this.name = name;
		this.stateInfo = authResultEnum.getStateInfo();
		this.state = authResultEnum.getState() ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
}
