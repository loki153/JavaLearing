package ProxyMode_4;

public class BuyProxy   implements  BuyHouse {
    Buy buy = new Buy();

    public void seeHouse(){
        System.out.println("代理选房");
    }

    public void pay(){
        System.out.println("代理支付");
    }
    @Override
    public void buyHouse() {
        seeHouse();
        buy.buyHouse();
        pay();
    }
}
