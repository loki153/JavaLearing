package AbstractFactoryMode_11;

public class OracleUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println(user);
    }

    @Override
    public User query() {
        return null;
    }
}
