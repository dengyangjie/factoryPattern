package vip.gupao.homework.factory;

/**
 * Description:汽车接口
 * Author: dengyangjie
 * Date: 2019-3-7
 * Time: HH:mm:ss
 */
public interface ICar {
    /**
     * @describe:创建汽车
     * @param clazz 汽车类型
     * @return ICar
     * */
    ICar createCar(Class<?> clazz);

    /**
     * @description 获取车牌号
     * @return int 6位数车牌号
     * */
    String getCarNum();

}
