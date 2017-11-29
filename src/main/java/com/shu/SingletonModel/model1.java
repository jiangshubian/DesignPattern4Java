package com.shu.singletonmodel;

/**
 * @author: jiangshubian
 * @Description: 懒汉式单例
 * @Date: Create in 2017-06-05 17:18
 * @Version: 1.0.0
 */
public final class Model1 {
    /**
     *当前对象
     */
    private static Model1 model1 = null;

    /**
     *类字节码对象
     */
    private static Object classLock = Model1.class;

    /**
     * @author: jiangshubian
     * @Description: 私有无参构造器
     */
    private Model1() {

    }

    /**
     * @return Model1 对象
     * @author: jiangshubian
     * @Description:
     */
    public static Model1 getModel1() {
        if (model1 == null) {
            synchronized (classLock) {
                if (model1 == null) {
                    model1 = new Model1();
                }
            }
        }
        return model1;
    }
}
