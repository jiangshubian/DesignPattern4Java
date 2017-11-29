package com.shu.observer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: jiangshubian
 * @Description:
 * @Date: Create in 2017-11-30 0:05
 * @Version: 1.0.0
 */
public class ThreadPoolUtils {

    public static ExecutorService executorService;

    static {
        executorService = Executors.newCachedThreadPool();
    }
}
