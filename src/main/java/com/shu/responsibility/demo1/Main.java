package com.shu.responsibility.demo1;

import com.shu.responsibility.demo1.req.IWomen;
import com.shu.responsibility.demo1.req.Women;
import com.shu.responsibility.demo1.responsibilitor.Father;
import com.shu.responsibility.demo1.responsibilitor.Husband;
import com.shu.responsibility.demo1.responsibilitor.Son;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by lenovo on 2018/6/10.
 */
public class Main {
    public static void main(String[] args) {
        Father f = new Father();
        Husband h = new Husband();
        Son s = new Son();


        f.setNextHandler(h);
        h.setNextHandler(s);


        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(3)+1));
        }

        for (IWomen w : arrayList) {
            f.handlerMessage(w);
        }
    }
}
