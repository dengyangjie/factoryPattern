package com.gupaoedu.singleton;

/**
 * Descriptions:枚举类型
 * Author: dengyangjie
 * Date: 2019-3-20
 * Time: HH:mm:ss
 */
public enum EnumSingleton {
    INSTANCE;
    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
