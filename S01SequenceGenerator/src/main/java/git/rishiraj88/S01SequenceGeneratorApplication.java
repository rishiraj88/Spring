package git.rishiraj88;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class S01SequenceGeneratorApplication {

	public static void main(String[] args) {
		//SpringApplication.run(S01SequenceGeneratorApplication.class, args);
	
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
	SequenceGenerator sequenceGenerator =	factory.getBean("sg", SequenceGenerator.class);
	System.out.println(sequenceGenerator.getSequence());
	System.out.println(sequenceGenerator.getSequence());
	System.out.println(sequenceGenerator.getSequence());
	System.out.println(sequenceGenerator.getSequence());
	
	}

}
