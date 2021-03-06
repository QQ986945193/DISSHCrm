package com.david.disshcrm.common.constant;

import org.apache.log4j.Logger;
/**
 * @Author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
/*
 * 系统全局常量配置类
 */
public class SysConstant {
	private static Logger log = Logger.getLogger(SysConstant.class);

	public static String CURRENT_USER_INFO = "_CURRENT_USER";	//当前用户session name
	public static String USE_DATABASE = "MySql";				//使用的数据库 Oracle/SQLServer
	public static String USE_DATABASE_VER = "5.0";				//使用的数据库版本 10g/2000

	public static String DEFAULT_PASS = "123456";				//默认密码
	public static int PAGE_SIZE = 10;							//分页时一页显示多少条记录


	/**
	 * CRM中的常量配置
	 */
	/*当前session中保存的用户*/
	public static final String SESSION_USER = "session_user";
	/*错误信息*/
	public static final String ERROR_MSG = "error_msg";
	public static final String session_user = "session_user";
}
