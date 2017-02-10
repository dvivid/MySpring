package com.mk.dy.test;

import com.mk.dy.aop.service.IAopService;
import com.mk.dy.aop.service.impl.AopServiceImpl;
import com.mk.dy.config.AppContextConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**

 *
 * @author dvivid
 * @version V1.0
 * @Title AopTest
 * @Package com.mk.dy.test
 * <p>
 * *****************************************
 * @Description
 * @date 2016/11/16
 */
public class AopTest {

    public static void main(String[] args) {
        //1.2个aspect的advice的执行顺序 aspect1 order = 1 ；aspect2 order=2
        /*顺序
         aspect1 around
        aspect1 before1
        aspect1 before2

        aspect2  around
        aspect2 before1
        aspect2 before2
        target method execute
        aspect2 around
        aspect2 after1
        aspect2 after2
        aspect2 afterReturn

        aspect1 after1
        aspect1 after2
        aspect1 afterReturn*/

        //2.同个aspect的advice的执行顺序
        AnnotationConfigApplicationContext ct = new AnnotationConfigApplicationContext(AppContextConfig.class);
        IAopService service = ct.getBean(IAopService.class);
        int result = service.execute();
        System.out.println(result);
        System.out.println( null instanceof AopTest);
    }

}
