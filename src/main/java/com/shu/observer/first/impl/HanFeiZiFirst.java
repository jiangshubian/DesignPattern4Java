package com.shu.observer.first.impl;

import com.shu.observer.first.IHanFeiZi;

/**
 * 实现类
 *
 * @author: jiangshubian
 * @Description:
 * @Date: Create in 2017-11-29 20:24
 * @Version: 1.0.0
 */
public class HanFeiZiFirst implements IHanFeiZi {

    private LiSi liSi = new LiSi();

    public void haveBreakfast() {
        System.out.println("HanFeiZi.haveBreakfast");
        this.liSi.update("HanFeiZi.haveBreakfast");
    }

    public void haveFun() {
        System.out.println("HanFeiZi.haveFun");
        this.liSi.update("HanFeiZi.haveFun");
    }
}
