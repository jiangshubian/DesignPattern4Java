package com.shu;

/**
 * @author: jiangshubian
 * @Description:
 * @Date: Create in 2017-06-07 14:44
 * @Version: 1.0.0
 */
public class BufferStringStr {
    private static char[] value;
    private static class Main{
        public static void main(String[] args) {
            StringBuffer sb = new StringBuffer();
            sb.append("shu");

            System.out.println(new String(sb));
            System.out.println(sb.toString());
            String s= new String();
            System.out.println();
        }
    }

    public static char charAt(int i){
        if (i < 0 || i >= value.length) {
            throw new StringIndexOutOfBoundsException(i + " is granter than "+value.length);
        }
        return value[i];
    }

}
