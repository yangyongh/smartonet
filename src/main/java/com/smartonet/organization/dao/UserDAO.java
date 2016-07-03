package com.smartonet.organization.dao;

import java.util.List;

import com.smartonet.organization.dto.UserProfile;
import com.smartonet.organization.entity.User;

public interface UserDAO {

	/**
	 * 通过登录用户名查询用户
	 * @param name
	 * @return
	 */
	UserProfile getUserProfileByName(String name) ;
	
	/**
	 * 通过用户ID查询用户对象
	 * @param user_id
	 * @return
	 */
	User getUserById(long user_id) ;
	
	/**
	 * 查询部门下所有用户
	 * @param departmentId
	 * @return
	 */
	List<User> getUserListByDepartment(long departmentId) ;
	
	/**
	 * 创建用户
	 * @param user
	 * @return
	 */
	int addUser(User user) ;
	
	/**
	 * 删除用户
	 * @param user_id
	 * @return
	 */
	int deleteUser(long user_id) ;
	
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	int updateUser(User user) ;
}
