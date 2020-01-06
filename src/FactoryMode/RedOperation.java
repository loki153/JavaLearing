package FactoryMode;

/**
 * @Author: Loki
 * @Date: 2020/1/6 9:07
 * @Project: JavaLearing
 * @Description:
 */
public class RedOperation extends BaseOpertaion{
    @Override
    public long getResult(long a, long b){
        return a - b;
    }
}
