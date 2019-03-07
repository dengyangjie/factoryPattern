package vip.gupao.homework.factory.factoryMethod;

import vip.gupao.homework.factory.BMWCar;
import vip.gupao.homework.factory.ICar;

/**
 * Descriptions:
 * Author: dengyangjie
 * Date: 2019-3-7
 * Time: HH:mm:ss
 */
public class BenzCarFactory extends CarFactoryMethod {
    @Override
    ICar create() {
        return new BMWCar();
    }
}
