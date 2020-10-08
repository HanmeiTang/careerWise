package external;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MonkeyLearnClient {
	// Note: set MONKEY_LEARN_API_KEY in APP_ROOT_DIR/.careerwise.yaml
	private static final String API_KEY = System.getenv("MONKEY_LEARN_API_KEY");
	public static void main(String[] args) {
		System.out.print(System.getenv());
	}
}
