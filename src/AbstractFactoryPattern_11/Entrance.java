package AbstractFactoryPattern_11;

public class Entrance {
    public static void main(String[] args){
        User user = new User();
        Department dept = new Department();


        IUser iu = DataAccess.CreateUser("MySQL");
        iu.insert(user);
        iu.query();

        IDepartment id = DataAccess.CreateDepartment("Oracle");
        id.insert(dept);
        id.query();

        System.out.println(iu instanceof MySQLUser);
        System.out.println(id instanceof  OracleDepartment);
    }
}
