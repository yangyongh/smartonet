package com.smartonet.organization.enums;

public enum AuthResultEnum {
	PASS(1,"登录成功"),
	WRONGPWD(0,"密码错误"),
	UNREGISTERED(-1,"未注册用户"),
	UNAUTH(-2,"未授权用户");
	
	private int state ;
	
	private String stateInfo ;
	
	AuthResultEnum(int state,String stateInfo){
		this.state = state ;
		this.stateInfo = stateInfo ;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}
	
	public static AuthResultEnum stateOf(int index){
		for(AuthResultEnum state : values()){
			if(state.getState() == index){
				return state ;
			}
		}
		return null ;
	}
}
