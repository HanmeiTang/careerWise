package db;

// TODO: why crash???
//import util.YamlUtil;

public class MySQLDBUtil {
    //private static final String INSTANCE = YamlUtil.getContent().get("AWS_INSTANCE");
	private static final String INSTANCE = "careerwise-db.citiv7qnn1e7.us-east-2.rds.amazonaws.com";
    private static final String PORT_NUM = "3306";
    //public static final String DB_NAME = YamlUtil.getContent().get("AWS_DB_NAME");
    public static final String DB_NAME = "careerWise";
    //private static final String USERNAME = YamlUtil.getContent().get("AWS_USERNAME");
    private static final String USERNAME = "admin";
    //private static final String PASSWORD = YamlUtil.getContent().get("AWS_PASSWORD");
    private static final String PASSWORD = "Aws_0218";
    public static final String URL = "jdbc:mysql://" + INSTANCE + ":" + PORT_NUM + "/" + DB_NAME + "?user=" + USERNAME
            + "&password=" + PASSWORD + "&autoReconnect=true&serverTimezone=UTC";

    public static void main(String[] args) {
        System.out.println(MySQLDBUtil.INSTANCE);
    }
}
