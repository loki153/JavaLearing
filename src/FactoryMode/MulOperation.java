package FactoryMode;

import FactoryMode.BaseOpertaion;

/**
 * @Author: Loki
 * @Date: 2020/1/6 8:52
 * @Project: JavaLearing
 * @Description:
 */
public class MulOperation extends BaseOpertaion {

    @Override
    public long getResult(long a,long b){
        return (a * b);
    }
}
