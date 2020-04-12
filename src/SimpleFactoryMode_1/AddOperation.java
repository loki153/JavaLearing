package SimpleFactoryMode_1;

/**
 * @Author: Loki
 * @Date: 2020/1/6 8:50
 * @Project: JavaLearing
 * @Description:
 */
public class AddOperation extends BaseOperation {

    @Override
    public  long getResult(long a, long b){
        return  a + b;
    }
}
