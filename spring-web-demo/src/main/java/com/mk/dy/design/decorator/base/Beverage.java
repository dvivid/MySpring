package com.mk.dy.design.decorator.base;

/**

 * @author dvivid
 * @version V1.0
 * @Title Beverage
 * @Package com.mk.dy.design.decorator.base
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/4
 */
public abstract class Beverage {

    protected String description;

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
