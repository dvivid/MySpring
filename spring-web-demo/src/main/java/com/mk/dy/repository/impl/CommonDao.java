package com.mk.dy.repository.impl;

import org.springframework.data.mongodb.core.MongoTemplate;

import javax.annotation.Resource;

/**

 *
 * @author dvivid
 * @version V1.0
 * @Title CommonDao
 * @Package com.mk.dy.repository.impl
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/6/21
 */
public abstract class CommonDao<T> {

    @Resource
    protected MongoTemplate mongoTemplate;



}
