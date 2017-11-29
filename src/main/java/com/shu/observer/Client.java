package com.shu.observer;

import java.util.concurrent.TimeUnit;

import com.shu.observer.first.Spy;
import com.shu.observer.first.impl.HanFeiZi;
import com.shu.observer.first.impl.HanFeiZiFirst;
import com.shu.observer.first.impl.LiSi;
import com.shu.observer.second.Observer;
import com.shu.observer.second.impl.HanFeiZiSecond;
import com.shu.observer.second.impl.JiangSi;
import com.shu.observer.second.impl.LiSiSecond;
import com.shu.observer.second.impl.WangSi;
import com.shu.observer.third.impl.HanFeiZiThird;
import com.shu.observer.third.impl.ObserverFirst;
import com.shu.observer.third.impl.ObserverSecond;
import com.shu.observer.third.impl.ObserverThird;

/**
 * @author: jiangshubian
 * @Description:
 * @Date: Create in 2017-11-29 20:38
 * @Version: 1.0.0
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
//        testFirst();
//        testSecond();
        testThree();
    }

    public static void test() throws InterruptedException {

        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();

        Spy breakfast = new Spy(liSi, hanFeiZi, "breakfast");
        breakfast.start();

        Spy haveFun = new Spy(liSi, hanFeiZi, "haveFun");
        haveFun.start();

        TimeUnit.SECONDS.sleep(5);
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
    public static void testFirst() throws InterruptedException {

        HanFeiZiFirst hanFeiZi = new HanFeiZiFirst();

        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }


    public static void testSecond(){
        //定义桑观察者
        Observer liSi = new LiSiSecond();
        Observer wangSi = new WangSi();
        Observer jiangSi = new JiangSi();

        //定义一个被观察者
        HanFeiZiSecond hanFeiZi = new HanFeiZiSecond();

        //向被观察者中添加观察者
        hanFeiZi.addObservable(liSi);
        hanFeiZi.addObservable(wangSi);
        hanFeiZi.addObservable(jiangSi);


        //监听被观察者行为
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
    public static void testThree(){
        //定义观察者
        java.util.Observer observerFirst = new ObserverFirst();
        java.util.Observer observerSecond = new ObserverSecond();
        java.util.Observer observerThird = new ObserverThird();

        //定义一个被观察者
        HanFeiZiThird hanFeiZi = new HanFeiZiThird();

        //向被观察者中添加观察者
        hanFeiZi.addObserver(observerFirst);
        hanFeiZi.addObserver(observerSecond);
        hanFeiZi.addObserver(observerThird);

        //监听被观察者行为
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
