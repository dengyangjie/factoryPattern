package vip.gupao.homework.factory.abstractFactory;

import vip.gupao.homework.factory.BMWCar;
import vip.gupao.homework.factory.ICar;

/**
 * Descriptions:
 * Author: dengyangjie
 * Date: 2019-3-7
 * Time: HH:mm:ss
 */
public class BMWCarAbstractFactory implements ICarFactory {
    @Override
    public ICar createCar() {
        return new BMWCar();
    }

    @Override
    public ICarGlass createCarGlass() {
        return new BMWCarGlass();
    }

    @Override
    public ICarWheel createCarWheel() {
        return new BMWCarWheel();
    }
}
