package com.smartonet.organization.entity;

/**
 * 部门实体类
 * @author yongh.yang
 */
public class Department {
	private long department_id ; //ID
	private String name ;
	private int type ; //部门类型，包括：设备厂商、政府（环保）、排污企业、运营商、系统维护
	private long parentId ;  //父节点，默认为0
	
	
	public long getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(long department_id) {
		this.department_id = department_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public long getParentId() {
		return parentId;
	}
	public void setParentId(long parentId) {
		this.parentId = parentId;
	}
}
