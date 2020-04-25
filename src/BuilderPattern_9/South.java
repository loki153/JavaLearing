package BuilderPattern_9;

public class South extends Cook {

    private Tofu tofu = new Tofu();

    @Override
    public void buildPartA() {
        tofu.add("甜");
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
