package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerAppln {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("annotations/SpringAnnotations.xml");
		//when no value is defined
		//Customer c = (Customer) ctx.getBean("customer");
		Customer c = (Customer) ctx.getBean("cust");
		System.out.println(c.getCode()+" "+c.getName()+" "+c.getOrders().getItemno()+" "+c.getOrders().getQuantity());
	}
}
