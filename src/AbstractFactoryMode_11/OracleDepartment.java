package AbstractFactoryMode_11;

public class OracleDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println(department);
    }

    @Override
    public User query() {
        return null;
    }
}
