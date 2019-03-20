package com.gupaoedu.singleton;

/**
 * Descriptions:饿汉式设计模式
 * Author: dengyangjie
 * Date: 2019-3-20
 * Time: HH:mm:ss
 */
public class HungrySingleton {
    private HungrySingleton(){
        if(singleton != null ){
            throw new RuntimeException("类已经创建");
        }
    }
    private static final HungrySingleton singleton = new HungrySingleton();
    // 提供一个入口
    public static HungrySingleton getInstance(){
        return singleton;
    }
}
