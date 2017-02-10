package com.mk.dy.design.adapter.adapter;


import com.mk.dy.design.adapter.adaptee.Duck;
import com.mk.dy.design.adapter.source.Turkey;

/**
 * @author dvivid
 * @version V1.0
 * @Title TurkeyAdapter
 * @Package com.mk.dy.design.adapter.adapter
 * <p/>
 * *****************************************
 * @Description 用turkey冒充鸭子，使用了适配器，把turkey转为鸭子
 * @date 2016/7/11
 */
public class TurkeyAdapter implements Duck{

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        turkey.fly();
    }
}
