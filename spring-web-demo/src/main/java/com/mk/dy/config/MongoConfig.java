package com.mk.dy.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 *
 * @author dvivid
 * @version V1.0
 * @Title MongoConfig
 * @Package com.mk.dy.config
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/6/20
 */
@Configuration
@EnableMongoRepositories(basePackages = {//该注解设置为指定目录下的接口产生Proxy实例
        "com.mk.dy.repository"
})
@PropertySource(value = "classpath:mongo.properties")
public class MongoConfig extends AbstractMongoConfiguration {


    @Autowired
    private Environment env;

    @Value("${spring.data.mongodb.uri}")
    private String mongodbUri;

    @Override
    protected String getDatabaseName() {
        return "test";
    }

    @Override
    public Mongo mongo() throws Exception {
        MongoClientURI mongoClientURI = new MongoClientURI(env.getProperty("spring.data.mongodb.uri"));
        MongoClient client = new MongoClient(mongoClientURI);
        return  client;
    }


    /**类似bean.xml中配置 class=PropertySourcesPlaceholderConfigurer
     * 配置后才能解析@value注解对应的属性名称
     * property文件解析配置
     *
     * @return
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
