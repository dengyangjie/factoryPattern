package com.gupaoedu.singleton;

import java.io.*;

/**
 * Descriptions:序列化设计模式
 * Author: dengyangjie
 * Date: 2019-3-20
 * Time: HH:mm:ss
 */
public class SeriableSingleton implements Serializable{
    private static final SeriableSingleton seriableSingleton =  new SeriableSingleton();

    public static SeriableSingleton getInstance(){
        return seriableSingleton;
    }
    private Object readResolve(){
        return  seriableSingleton;
    }

    public static void main(String[] args) {
        SeriableSingleton s1 = null;
        SeriableSingleton s2 = SeriableSingleton.getInstance();

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fos = new FileOutputStream("E://SeriableSingleton.obj");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            fis = new FileInputStream("E://SeriableSingleton.obj");
            ois = new ObjectInputStream(fis);
            s1 = (SeriableSingleton)ois.readObject();

            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(s1 == s2);
    }
}
