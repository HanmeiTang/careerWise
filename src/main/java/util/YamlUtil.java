package util;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;

import org.yaml.snakeyaml.Yaml;


public class YamlUtil {
    public static String currentDir = System.getProperty("user.dir");
    public static String yamlName = ".careerwise.yaml";

    public static HashMap<String, String> getContent() {
        Yaml yaml = new Yaml();
        String input = currentDir + "/" + yamlName;

        try {
            InputStream inputStream = new FileInputStream(input);
            HashMap<String, String> map = yaml.loadAs(inputStream, HashMap.class);
            return map;
        } catch (IOException e) {
            String format = "Error read %s\n";
            System.out.printf(format, input);
        }

        return null;

    }

    public static void main(String[] args) {
        // Quick demo
        System.out.println(YamlUtil.currentDir);
        System.out.println(YamlUtil.getContent().get("MONKEY_LEARN_API_KEY"));
    }

}
