package SimpleFactoryMode_1;

import java.util.Scanner;

/**
 * @Author: Loki
 * @Date: 2020/1/6 9:00
 * @Project: JavaLearing
 * @Description:
 */
public class OperationFactory {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("选择计算类型");
        String operation = sc.next();

        System.out.println("请输入计算数值");
        long a  = sc.nextLong();
        long b = sc.nextLong();

        switch (operation) {
            case "+":
                BaseOperation operation1 = new AddOperation();
                System.out.println(a + operation + b + "=" + operation1.getResult(a,b));
                break;

            case "-":
                BaseOperation operation2 = new RedOperation();
                System.out.println(a + operation + b + "=" + operation2.getResult(a,b));
                break;

            case "*":
                BaseOperation operation3 = new MulOperation();
                System.out.println(a + operation + b + "=" + operation3.getResult(a,b));
                break;

            case "/":
                BaseOperation operation4 = new DivOperation();
                System.out.println(a + operation + b + "=" + operation4.getResult(a,b));
                break;

            default :
                System.out.println("默认");
                break;
        }

    }
}
