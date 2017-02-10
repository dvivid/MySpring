package com.mk.dy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**

 * @author dvivid
 * @version V1.0
 * @Title Aspect
 * @Package com.mk.dy.aop
 * <p>
 * *****************************************
 * @Description
 * @date 2016/11/15
 */
@Component
@Aspect
@Order(2)
public class AspectCut2 {

    //  顺序 around
    //      before
    //      target method
    //      around
    //      after
    //      afterReturn
    @Pointcut(value="execution(* com.mk.dy.aop.service.impl.AopServiceImpl.*())")
    private void pointCut(){

    }

    @Before(value = "pointCut()")
    public void before2(){
        System.out.println("AspectCut2 in before2 method");
    }

    @Before(value = "pointCut()")
    public void before1(){
        System.out.println("AspectCut2 in before1 method");
    }

    @After(value = "pointCut()")
    public void after2(){
        System.out.println("AspectCut2 in after2 method");
    }
    @After(value = "pointCut()")
    public void after1(){
        System.out.println("AspectCut2 in after1 method");
    }
    @Around(value = "pointCut()")
    public int aroundExecute(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("AspectCut2 in around method start");
        Object result = 0;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("AspectCut2 in around method end");
        return (Integer) result;

    }
    @AfterReturning(value = "pointCut()")
    public void afterReturn(){
        System.out.println("AspectCut2 in return ...");
    }

}
