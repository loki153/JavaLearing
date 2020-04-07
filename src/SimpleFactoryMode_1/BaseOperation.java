package SimpleFactoryMode_1;

/**
 * @Author: Loki
 * @Date: 2020/1/6 8:44
 * @Project: JavaLearing
 * @Description:
 */
public class BaseOperation {
    private long inputA;
    private long inputB;

    public long getInputA() {
        return inputA;
    }

    public void setInputA(long inputA) {
        this.inputA = inputA;
    }

    public long getInputB() {
        return inputB;
    }

    public void setInputB(long inputB) {
        this.inputB = inputB;
    }

    public long getResult(long inputA, long inputB){
        return 0;
    }
}
