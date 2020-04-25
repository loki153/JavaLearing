package SimpleFactoryPattern_1;

/**
 * @Author: Loki
 * @Date: 2020/1/6 9:43
 * @Project: JavaLearing
 * @Description:
 */
public class DivOperation extends BaseOperation {
    @Override
    public long getResult(long a, long b){
        long c = 0;
        try {
            c =  a / b;
        }catch (ArithmeticException ari){
            System.out.println("除数不能为0");
        }catch (Exception e ){
            e.printStackTrace();
        }
        finally {
            return c;
        }
    }
}
