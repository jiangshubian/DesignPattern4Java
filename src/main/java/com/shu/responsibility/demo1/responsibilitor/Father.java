package com.shu.responsibility.demo1.responsibilitor;

import com.shu.responsibility.demo1.Handler;
import com.shu.responsibility.demo1.req.IWomen;

/**
 * Created by lenovo on 2018/6/10.
 */
public class Father extends Handler {

    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    public void response(IWomen women) {
        System.out.println("Father.response");
        System.out.println(women.getType() + women.getRequest());
    }
}
