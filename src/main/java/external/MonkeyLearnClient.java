package external;

import java.io.File;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;


import org.yaml.snakeyaml.Yaml;

public class MonkeyLearnClient {
	// Note: set MONKEY_LEARN_API_KEY in APP_ROOT_DIR/.careerwise.yaml
	
	private static String API_KEY;
	
	public MonkeyLearnClient() {
		//API_KEY = 
		readApiKey();
	}
	
	private void readApiKey() {
		Yaml yaml = new Yaml();
		String dir = new File(System.getProperty("user.dir") + "/.careerwise.yaml").toString();
		
		InputStream istr = this.getClass()
				.getClassLoader()
				.getResourceAsStream(dir);
		//System.out.print(file.toString());
		Map<String, Object> dic = yaml.load(istr);
		
		
		//return dic.get("MONKEY_LEARN_API_KEY"); 
	}
	public static void main(String[] args) {
		MonkeyLearnClient mkc = new MonkeyLearnClient();
		
		//System.out.println(new File(System.getProperty("user.dir") + "/.careerwise.yaml"));
		

	}
}
