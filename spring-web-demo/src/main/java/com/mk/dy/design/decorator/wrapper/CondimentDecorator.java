package com.mk.dy.design.decorator.wrapper;

import com.mk.dy.design.decorator.base.Beverage;

/**

 * @author dvivid
 * @version V1.0
 * @Title CondimentDecorator
 * @Package com.mk.dy.design.decorator.wrapper
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/4
 */
public abstract class CondimentDecorator extends Beverage{

    public abstract String getDescription();
}
