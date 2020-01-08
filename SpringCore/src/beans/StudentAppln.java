package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentAppln {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/SpringCore.xml");
		Student s = (Student) ctx.getBean("std");
		System.out.println(s.getName()+" "+s.getRegno()+" "+s.getAddress().getCity()+" "+s.getAddress().getStreet());
	}
}
