package mvc;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import beans.Employee;

@Repository
public class EmployeeDao {
	public List<Employee> getEmpls(){
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(101,"ankita",7000));
		emplist.add(new Employee(101,"aishwarya",8000));
		emplist.add(new Employee(101,"abinash",7800));
		return emplist;
	}
}
