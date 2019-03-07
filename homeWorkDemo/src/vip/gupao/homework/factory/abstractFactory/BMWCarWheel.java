package vip.gupao.homework.factory.abstractFactory;

/**
 * Descriptions:
 * Author: dengyangjie
 * Date: 2019-3-7
 * Time: HH:mm:ss
 */
public class BMWCarWheel implements ICarWheel {
    @Override
    public ICarWheel createWheel() {
        System.out.println("生产宝马汽车轮胎");
        return new BMWCarWheel();
    }
}
