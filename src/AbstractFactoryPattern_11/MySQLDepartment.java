package AbstractFactoryPattern_11;

public class MySQLDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println(department);
    }

    @Override
    public User query() {
        return null;
    }
}
