-- -----------------------------------------------
-- ---------------创建数据库 ----------------------
-- -----------------------------------------------

DROP DATABASE IF EXISTS smartcloud;
CREATE DATABASE IF NOT EXISTS smartcloud /*!40100 DEFAULT CHARACTER SET utf8 */;
USE smartcloud;

-- 创建用户表
DROP TABLE IF EXISTS t_user ;
CREATE TABLE IF NOT EXISTS t_user (
  user_id bigint NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  name varchar(128) NOT NULL COMMENT '用户名称',
  password varchar(64) NOT NULL COMMENT '用户密码',
  phone bigint NOT NULL COMMENT '用户手机号',
  email varchar(64) NOT NULL COMMENT '用户邮箱地址',
  first_name varchar(32) NOT NULL COMMENT '显示的用户名字',
  middle_name varchar(32) NOT NULL COMMENT '显示的中间名字',
  last_name varchar(32) NOT NULL COMMENT '显示的姓',
  sex tinyint NOT NULL DEFAULT 0 COMMENT '性别， 0：未设置；1：男士；2：女士',
  registration_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  title int(6) NOT NULL DEFAULT -1 COMMENT '职务',
  status tinyint NOT NULL DEFAULT 1 COMMENT '用户状态，0：未启用，1：已启用',
  department_id bigint NOT NULL COMMENT '所属部门ID',
  PRIMARY KEY (user_id),
  KEY idx_department(department_id),
  KEY idx_name (name),
  KEY idx_email (email)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='用户表';