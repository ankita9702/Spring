package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeAppln {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/SpringCore.xml");
		Employee e1 = (Employee) ctx.getBean("emp");
		e1.setSalary(9000);
		System.out.println(e1.getCode()+" "+e1.getName()+" "+e1.getSalary());
		Employee e2 = (Employee) ctx.getBean("emp");
		e2.setCode(117);
		e2.setName("Niki");
		e2.setSalary(6000);
		System.out.println(e2.getCode()+" "+e2.getName()+" "+e2.getSalary()+" "+e2.getSkills());
	}
}
