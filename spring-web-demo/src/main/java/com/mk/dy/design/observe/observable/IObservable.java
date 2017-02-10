package com.mk.dy.design.observe.observable;

import com.mk.dy.design.observe.observer.IObserver;

/**

 * @author dvivid
 * @version V1.0
 * @Title IObservable
 * @Package com.mk.dy.design.observe.observable
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/1
 */
public interface IObservable {

    void setChanged();
    void clearChanged();
    void addObserver(IObserver observer);
    void deleteObserver(IObserver observer);
    void notifyObservers();
}
