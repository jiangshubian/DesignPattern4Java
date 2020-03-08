package com.shu.singleton;

/**
 * @author: jiangshubian
 * @Description: 恶汉式单例
 * @Date: Create in 2017-06-05 17:18
 * @Version: 1.0.0
 */
public final class Model2 {
    /**
     * 当前对象
     */
    private static final Model2 MODEL_2 = new Model2();


    /**
     * @author: jiangshubian
     * @Description: 私有无参构造器
     */
    private Model2() {
    }

    /**
     * @return Model1 对象
     * @author: jiangshubian
     * @Description:
     */
    public static Model2 getModel2() {
        return MODEL_2;
    }
}
