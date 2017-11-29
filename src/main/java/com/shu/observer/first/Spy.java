package com.shu.observer.first;

import com.shu.observer.first.impl.HanFeiZi;
import com.shu.observer.first.impl.LiSi;

/**
 * @author: jiangshubian
 * @Description:
 * @Date: Create in 2017-11-29 20:29
 * @Version: 1.0.0
 */
public class Spy extends Thread {

    private LiSi liSi;
    private HanFeiZi hanFeiZi;

    private String type;

    public Spy(LiSi liSi, HanFeiZi hanFeiZi, String type) {
        this.liSi = liSi;
        this.hanFeiZi = hanFeiZi;
        this.type = type;
    }

    @Override
    public void run() {
        while (true) {
            if ("breakfast".equals(this.type) && this.hanFeiZi.isHaveBreakfast()) {
                this.liSi.update("breakfast");
                this.hanFeiZi.setHaveBreakfast(false);
            } else {
                if (this.hanFeiZi.isHaveFun()) {
                    this.liSi.update("haveFun");
                    this.hanFeiZi.setHaveFun(false);
                }
            }
        }
    }
}
