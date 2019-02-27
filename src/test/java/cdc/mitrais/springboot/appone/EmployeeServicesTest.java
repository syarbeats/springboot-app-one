package cdc.mitrais.springboot.appone;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import cdc.mitrais.springboot.appone.dao.EmployeeRepository;
import cdc.mitrais.springboot.appone.model.Employee;
import cdc.mitrais.springboot.appone.services.EmployeeServices;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServicesTest {

	
	@Autowired
	private EmployeeServices employeeService;
	@Autowired
	private EmployeeRepository empRepo;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	@Transactional
    @Rollback(true)
	public void testAddEmployee() {
		empRepo.save(new Employee(909, "Elthon John", 75000));
		Assert.assertEquals("Elthon John", employeeService.getEmployeeById(909).getName());
	}

}
