package TemplatePattern_7;

public class Entrance {
    public static void main(String[] args){
        Template template;

        template = new RowFirst();
        template.templateMethod();


        template = new ColumnFirst();
        template.templateMethod();
    }
}
