import java.io.FileReader;
import java.util.Properties;

public class MyBeanFactory {
    public Object getBean(String beanName) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("classpath:beans.properties"));
        String className = properties.getProperty(beanName);
        Class clazz = Class.forName(className);
        return clazz.newInstance();
    }
}