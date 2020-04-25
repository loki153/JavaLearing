package ObserverPattern_10;

public class Fire extends Abyss {
    private  String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        System.out.println(message);
    }
}
