package core;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigManager {

    private static Properties prop = new Properties();

    static {
        try {
            prop.load(new FileInputStream("src/test/resources/config/qa.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String get(String key){
        return prop.getProperty(key);
    }
}