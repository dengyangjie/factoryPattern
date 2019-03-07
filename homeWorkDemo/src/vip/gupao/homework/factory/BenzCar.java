package vip.gupao.homework.factory;

/**
 * Descriptions:
 * Author: dengyangjie
 * Date: 2019-3-7
 * Time: HH:mm:ss
 */
public class BenzCar implements ICar{
    @Override
    public ICar createCar(Class<?> clazz) {
        ICar car =null;
        if( null != clazz ){
            try {
                System.out.println("购买奔驰成功...");
                car =  (ICar) clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return car;
    }

    @Override
    public String getCarNum() {
        // 获取三位随机数
        int carNum = (int)(Math.random()*900 + 100);
        System.out.println("this car num is : BEN"+carNum);
        return "BEN"+ carNum;
    }
}
