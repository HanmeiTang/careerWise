package db;

import util.YamlUtil;

public class MySQLDBUtil {
	private static final String INSTANCE = YamlUtil.getContent().get("MODEL_ID");
	private static final String PORT_NUM = "3306";
	public static final String DB_NAME = YamlUtil.getContent().get("DB_NAME");
	private static final String USERNAME = YamlUtil.getContent().get("USERNAME");
	private static final String PASSWORD = YamlUtil.getContent().get("PASSWORD");
	public static final String URL = "jdbc:mysql://" + INSTANCE + ":" + PORT_NUM + "/" + DB_NAME + "?user=" + USERNAME
			+ "&password=" + PASSWORD + "&autoReconnect=true&serverTimezone=UTC";

}
