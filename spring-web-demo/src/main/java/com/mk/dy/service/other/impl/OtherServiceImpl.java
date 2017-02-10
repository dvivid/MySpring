package com.mk.dy.service.other.impl;

import com.mk.dy.service.other.OtherService;
import org.springframework.stereotype.Service;

/**

 * @author dvivid
 * @version V1.0
 * @Title OtherServiceImpl
 * @Package com.mk.dy.service.other.impl
 * <p>
 * *****************************************
 * @Description
 * @date 2016/11/15
 */
@Service
public class OtherServiceImpl implements OtherService {


    public void doOther() {
        System.out.println("do other in OtherServiceImpl.doOther() method");
    }
}
