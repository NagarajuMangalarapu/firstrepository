package employee;
import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Client 
{

	public static void main(String [] args)
	{
		System.out.println("hey");
	 Employee eref = new Employee();
	 eref.eId =0142;
	 eref.eName = "Nag";
	 eref.eAddress = "India";
	 System.out.println("Employee details are : "+eref);
	 
	 
	 Resource resource = new ClassPathResource("NewFile.xml");
	
	//BeanFactory factory = new XmlBeanFactory(resource);
	ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");

	 Employee emp1 = (Employee)context.getBean("emp");
	// emp1.displayInfo();
	 System.out.println(emp1+"ello");
	}

}
