package AbstractFactoryPattern_11;

public class MySQLUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println(user);
    }

    @Override
    public User query() {
        return null;
    }
}
