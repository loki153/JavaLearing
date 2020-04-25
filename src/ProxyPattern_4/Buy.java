package ProxyPattern_4;

public class Buy implements  BuyHouse {
    @Override
    public void buyHouse() {
        System.out.println("I am buyer with money");
    }
}
