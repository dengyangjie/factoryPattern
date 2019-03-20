package com.gupaoedu.singleton;

/**
 * Descriptions:内部类
 * Author: dengyangjie
 * Date: 2019-3-20
 * Time: HH:mm:ss
 */
public class InnerSingleton {

    static class Hodler{
        public static final InnerSingleton singleton = new InnerSingleton();
    }
    public static InnerSingleton getInstance(){
       return Hodler.singleton;
    }
}
