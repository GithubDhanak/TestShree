package spring.sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClaas {

	public static void main(String[] args) {
	
	Resource resource	=  new ClassPathResource("/spring/sample/applicationContext.xml");
	BeanFactory ioc = new XmlBeanFactory(resource);
	
	Object obj = ioc.getBean("emp");
	Employee emp = (Employee)obj;
	
	System.out.println(emp.getName());
	System.out.println(emp.getDesignation());    
  }
}
