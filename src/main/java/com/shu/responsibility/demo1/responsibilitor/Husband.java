package com.shu.responsibility.demo1.responsibilitor;

import com.shu.responsibility.demo1.Handler;
import com.shu.responsibility.demo1.req.IWomen;

/**
 * Created by lenovo on 2018/6/10.
 */
public class Husband extends Handler {
    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    public void response(IWomen women) {
        System.out.println("Husband.response");
        System.out.println(women.getType() + women.getRequest());
    }
}
