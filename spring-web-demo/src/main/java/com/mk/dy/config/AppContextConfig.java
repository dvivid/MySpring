package com.mk.dy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**

 *
 * @author dvivid
 * @version V1.0
 * @Title AppContextConfig
 * @Package com.mk.dy.config
 * <p/>
 * *****************************************
 * @Description  应用上下文配置
 * @date 2016/6/12
 */
@Configuration
@ComponentScan(basePackages = {"com.mk.dy.aop"})
@EnableAspectJAutoProxy
public class AppContextConfig {
}
