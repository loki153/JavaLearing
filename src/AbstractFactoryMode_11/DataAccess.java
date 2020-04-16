package AbstractFactoryMode_11;

public class DataAccess {
    private static  String db = "MySQL";
//    private static final String db = "Oracle";

    public static IUser CreateUser(String db){
        IUser result = null;

        switch (db){
            case "MySQL":
                result = new MySQLUser();
                break;
            case "Oracle":
                result = new OracleUser();
                break;
            default:
                System.out.println("错误的输入");
                break;
        }
        return result;
    }


    public static IDepartment CreateDepartment(String db){
        IDepartment result = null;

        switch (db){
            case "MySQL":
                result = new MySQLDepartment();
                break;
            case "Oracle":
                result = new OracleDepartment();
                break;
            default:
                System.out.println("错误的输入");
                break;
        }
        return result;
    }


}
