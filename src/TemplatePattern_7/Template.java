package TemplatePattern_7;

public abstract class Template {
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    public void templateMethod(){
        System.out.println("画格子");
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("画好了！");
    }
}
