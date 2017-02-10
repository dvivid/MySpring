package com.mk.dy.design.observe.observer;

import com.mk.dy.design.observe.observable.IObservable;

import java.util.Map;

/**

 * @author dvivid
 * @version V1.0
 * @Title IObserver
 * @Package com.mk.dy.design.observe.observer
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/1
 */
public interface IObserver {
    void update(IObservable observable,Object args);
    void display(Map<String,Object> args);
}
