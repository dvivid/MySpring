package com.mk.dy.design.observe.observer;

import com.mk.dy.design.observe.observable.IObservable;

import java.util.Map;

/**

 * @author dvivid
 * @version V1.0
 * @Title ObserverOne
 * @Package com.mk.dy.design.observe.observer
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/1
 */
public class ObserverOne implements IObserver{


    public ObserverOne(IObservable observable){
        observable.addObserver(this);
    }


    public void update(IObservable observable, Object args) {
        display((Map<String,Object>) args);
    }

    public void display(Map<String, Object> args) {
        for(Map.Entry entry :args.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }


}
