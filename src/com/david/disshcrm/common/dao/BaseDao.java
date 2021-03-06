package com.david.disshcrm.common.dao;

import com.david.disshcrm.common.domian.Page;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;


public interface BaseDao {


    //分页查询，将数据封装到一个page分页工具类对象
    public <T> Page<T> findPage(String hql, Page<T> page, Class<T> entityClass, Object[] params);

    //新增和修改保存
    public <T> void saveOrUpdate(T entity);

    //批量新增和修改保存
    public <T> void saveOrUpdateAll(Collection<T> entitys);


    /*****************************************************/
    //新增
    public <T> void save(T entity);
    //单条删除，按id
    public <T> void deleteById(Class<T> entityClass, Serializable id);

    //批量删除
    public <T> void delete(Class<T> entityClass, Serializable[] ids);

    //查询所有，带条件查询
    public <T> List<T> find(String hql, Class<T> entityClass, Object[] params);

    //获取一条记录
    public <T> T get(Class<T> entityClass, Serializable id);


}