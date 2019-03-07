package vip.gupao.homework.factory.abstractFactory;

/**
 * Descriptions:
 * Author: dengyangjie
 * Date: 2019-3-7
 * Time: HH:mm:ss
 */
public class AbstractFactoryMainTest {
    public static void main(String[] args) {
        ICarFactory factory = new BMWCarAbstractFactory();
        factory.createCar().createCar(factory.createCar().getClass());
        factory.createCar().getCarNum();
        factory.createCarGlass().createCarGlass();
        factory.createCarWheel().createWheel();

        // 同样，奔驰和凯迪拉克也能自己实现自己的汽车制造，挡风玻璃制造，轮胎制造。
        // 当有新加入的产品，例如：反光镜，只需要修改ICarFactory 以及添加 反光镜接口和实现，用户不需要知道，提供API即可
    }
}
