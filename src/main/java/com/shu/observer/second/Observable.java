package com.shu.observer.second;

/**
 * 被观察者
 *
 * @author: jiangshubian
 * @Description:
 * @Date: Create in 2017-11-29 22:09
 * @Version: 1.0.0
 */
public interface Observable {
    //增加观察者
    void addObservable(Observer observer);

    //删除观察者
    void deleteObserver(Observer observer);

    //通知观察者
    void notifyObserver(String context);
}
