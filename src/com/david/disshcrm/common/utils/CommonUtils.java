package com.david.disshcrm.common.utils;

import java.util.Map;
import java.util.UUID;

import com.david.disshcrm.common.web.converter.DateConverter;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;


/**
 * @Author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 * @OsChina空间: https://my.oschina.net/mcxiaobing
 */
public class CommonUtils {
	/**
	 * 将map中的数据直接封装到一个javabean中
	 */
	public static <T> T toBean(Map map,Class<T> clazz) {
		try {
			/**
			 * 创建指定类型的JavaBean对象
			 */
			T bean = clazz.newInstance();
			ConvertUtils.register(new DateConverter(), java.util.Date.class);
			//将数据封装在javabean中
			BeanUtils.populate(bean, map);
			//返回javabean对象
			return bean;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}

	/**
	 * 获取一个32位的随机数 16位数字组成。并去掉“-”并且转换为大写
	 *
	 */
	public static String getUUIDRandomNum() {
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();
	}
}
