package com.shu.singletonmodel;

/**
 * @author: jiangshubian
 * @Description:
 * @Date: Create in 2017-06-05 17:33
 * @Version: 1.0.0
 */
public enum Model3 implements EnumInterface {
    /**
     *
     */
    RED(0) {
        private int i = 10;

        public int getI() {
            return i;
        }

        public void setValues() {
            System.out.println("Model3.setValues1");
        }
    }, YELLOW(1) {
        public void setValues() {
            System.out.println("Model3.setValues2");
        }
    };

    static {
        System.out.println("Model3.static initializer");
    }

    /**
     *
     */
    private int value;

    /**
     * @param value
     */
    Model3(int value) {
        this.value = value;
    }



    private static class Main {
        /**
         * @param args sdfd
         */
        public static void main(String[] args) {
            System.out.println(Model3.valueOf("RED"));
            System.out.println(Model3.COLOR);
//            Model3.RED.setValues();
        }
    }
}
