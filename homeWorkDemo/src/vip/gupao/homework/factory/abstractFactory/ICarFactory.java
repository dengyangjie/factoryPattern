package vip.gupao.homework.factory.abstractFactory;

import vip.gupao.homework.factory.ICar;

/**
 * Descriptions:
 * Author: dengyangjie
 * Date: 2019-3-7
 * Time: HH:mm:ss
 */
public interface ICarFactory {
    ICar createCar();
    ICarGlass createCarGlass();
    ICarWheel createCarWheel();
}
