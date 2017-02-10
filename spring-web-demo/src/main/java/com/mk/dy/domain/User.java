package com.mk.dy.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

/**

 * @author dvivid
 * @version V1.0
 * @Title User
 * @Package com.mk.dy.domain
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/6/13
 */
@Document(collection = "user")
public class User implements Cloneable{

    private String id;
    private String name;
    private Map<String, Object> info;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }

    public static class Builder{
        private String id;
        private String name;
        private Map<String,Object> info;

        public Builder setId(String id){
            this.id = id;
            return this;
        }

        public Builder setName(String name){
            this.name=name;
            return this;
        }

        public Builder setInfo(Map<String,Object> info){
            this.info = info;
            return this;
        }

        public User build(){
            return new User(this);
        }


    }

    private  User(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.info = builder.info;
    }

    public static Builder builder(){
        return new Builder();
    }

    public User(){}


}
