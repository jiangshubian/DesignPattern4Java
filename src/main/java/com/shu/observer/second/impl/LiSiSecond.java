package com.shu.observer.second.impl;

import com.shu.observer.second.Observer;

/**
 * 实现类
 *
 * @author: jiangshubian
 * @Description:
 * @Date: Create in 2017-11-29 20:24
 * @Version: 1.0.0
 */
public class LiSiSecond implements Observer {
    public void update(String context) {
        System.out.println("LiSiSecond.update");
        this.reportTo(context);
        System.out.println("LiSiSecond.over!");
    }

    private void reportTo(String context) {
        System.out.println("Say somethings to others :" + context);
    }
}
