package com.gupaoedu.singleton;

/**
 * Descriptions:懒汉式设计模式
 * Author: dengyangjie
 * Date: 2019-3-20
 * Time: HH:mm:ss
 */
public class LazySingleton {
    private LazySingleton(){
        if( null != singleton){
            throw new RuntimeException("实例已被创建");
        }
    }

    private static LazySingleton singleton;
    // double check
    public static LazySingleton getInstance(){
        if( null == singleton ){
            synchronized (LazySingleton.class){
                if (null == singleton){
                    singleton = new LazySingleton();
                }
            }
        }
        return singleton;
    }
}
