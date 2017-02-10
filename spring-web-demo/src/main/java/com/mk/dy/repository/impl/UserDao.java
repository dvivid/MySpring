package com.mk.dy.repository.impl;

import com.mk.dy.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**

 *
 * @author dvivid
 * @version V1.0
 * @Title UserDao
 * @Package com.mk.dy.repository
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/6/21
 */
@Repository
public class UserDao extends   CommonDao<User>{


    public void updateByName(String name){
        Query query =  new Query();
        Criteria criteria = new Criteria("name").is(name);
        query.addCriteria(criteria);

        Update update = new Update();
        update.set("name","update"+name);
        this.mongoTemplate.updateMulti(query,update,User.class);
    }

    public void deleteByName(String name){
        Query query =  new Query();
        Criteria criteria = new Criteria("name").is(name);
        query.addCriteria(criteria);
        this.mongoTemplate.findAndRemove(query, User.class);
    }

    /**
     * 分页查询
     * @param name
     * @param currentPage
     * @param pageSize
     * @return
     */
    public Page<User> findUserByPage(String name,int currentPage,int pageSize){
        Pageable requestPage = new PageRequest(currentPage,pageSize);
        Query query = new Query();
        query.addCriteria(Criteria.where("name").regex("name"));
        long count = this.mongoTemplate.count(query,User.class);
        query.skip(currentPage*pageSize).limit(pageSize);
        List<User> users = this.mongoTemplate.find(query,User.class);
        Page<User> page = new PageImpl<User>(users,requestPage,count);
        return page;
    }
}
