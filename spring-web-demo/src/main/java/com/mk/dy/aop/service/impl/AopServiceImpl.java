package com.mk.dy.aop.service.impl;

import com.mk.dy.aop.service.IAopService;
import org.springframework.stereotype.Service;

/**

 * @author dvivid
 * @version V1.0
 * @Title AopServiceImpl
 * @Package com.mk.dy.aop.service.impl
 * <p>
 * *****************************************
 * @Description
 * @date 2016/11/16
 */
@Service
public class AopServiceImpl implements IAopService {

    public int execute() {
        System.out.println("execute in AopServiceImpl");
        return 1;
    }
}
