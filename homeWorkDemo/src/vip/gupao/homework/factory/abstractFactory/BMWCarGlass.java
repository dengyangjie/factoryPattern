package vip.gupao.homework.factory.abstractFactory;

/**
 * Descriptions:
 * Author: dengyangjie
 * Date: 2019-3-7
 * Time: HH:mm:ss
 */
public class BMWCarGlass implements ICarGlass {
    @Override
    public ICarGlass createCarGlass() {
        System.out.println("生产宝马挡风玻璃...");
        return new BMWCarGlass();
    }
}
