package BuilderMode_9;

public class North extends  Cook {

    private  Tofu tofu = new Tofu();
    @Override
    public void buildPartA() {
        tofu.add("咸");
    }

    @Override
    public void buildPartB() {
        tofu.add("豆腐脑");
    }

    @Override
    public Tofu GetResult() {
        return tofu;
    }
}
