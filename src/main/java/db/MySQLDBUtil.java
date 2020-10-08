package db;

public class MySQLDBUtil {
	// TODO: Add this to config file
	private static final String INSTANCE = "careerwise-db.citiv7qnn1e7.us-east-2.rds.amazonaws.com";
	private static final String PORT_NUM = "3306";
	// TODO: Add this to config file
	public static final String DB_NAME = "careerWise";
	private static final String USERNAME = "admin";
	// TODO: Add this to config file
	private static final String PASSWORD = "YOUR_PASSWORD";
	public static final String URL = "jdbc:mysql://" + INSTANCE + ":" + PORT_NUM + "/" + DB_NAME + "?user=" + USERNAME
			+ "&password=" + PASSWORD + "&autoReconnect=true&serverTimezone=UTC";

}
