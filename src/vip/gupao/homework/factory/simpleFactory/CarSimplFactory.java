package vip.gupao.homework.factory.simpleFactory;

import vip.gupao.homework.factory.BMWCar;
import vip.gupao.homework.factory.BenzCar;
import vip.gupao.homework.factory.CadillacCar;
import vip.gupao.homework.factory.ICar;

/**
 * Descriptions:
 * Author: dengyangjie
 * Date: 2019-3-7
 * Time: HH:mm:ss
 */
public class CarSimplFactory {
    public ICar create(String name){
        if( null == name ){
            return  null;
        }
        if( "宝马".equals(name) ){
            return new BMWCar();
        }else if("奔驰".equals(name) ){
            return new BenzCar();
        }else if("凯迪拉克".equals(name) ){
            return new CadillacCar();
        }else {
            System.out.println("没有此产品...");
            return null;
        }
    }
}
