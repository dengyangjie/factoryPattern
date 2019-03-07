package vip.gupao.homework.factory.factoryMethod;

import vip.gupao.homework.factory.CadillacCar;
import vip.gupao.homework.factory.ICar;

/**
 * Descriptions:
 * Author: dengyangjie
 * Date: 2019-3-7
 * Time: HH:mm:ss
 */
public class CadillacCarFactory extends CarFactoryMethod {
    @Override
    ICar create() {
        return new CadillacCar();
    }
}
