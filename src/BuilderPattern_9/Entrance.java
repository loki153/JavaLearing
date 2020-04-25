package BuilderPattern_9;

public class Entrance {

    public static  void main(String[] args){
        Customer customer = new Customer();

        Cook a = new North();
        Cook b = new South();

        customer.enjoy(a);
        Tofu x = a.GetResult();
        x.show();

        System.out.println();

        customer.enjoy(b);
        Tofu y = b.GetResult();
        y.show();


    }




}
