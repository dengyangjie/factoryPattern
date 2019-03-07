package vip.gupao.homework.factory.simpleFactory;

/**
 * Descriptions:
 * Author: dengyangjie
 * Date: 2019-3-7
 * Time: HH:mm:ss
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        CarSimplFactory factory = new CarSimplFactory();
        factory.create("宝马").createCar(factory.create("宝马").getClass());
        factory.create("宝马").getCarNum();
    }
}
