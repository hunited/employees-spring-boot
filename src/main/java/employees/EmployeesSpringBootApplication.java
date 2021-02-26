package employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class EmployeesSpringBootApplication {

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(EmployeesSpringBootApplication.class, args);
	}

//	private JdbcTemplate jdbcTemplate;
//
//	public void run(String... args) {
//		jdbcTemplate.update("INSERT INTO `employees` (`emp_name`) VALUES (?)", "Jane Spring Boot Doe");
//
//		List<Employee> employees = jdbcTemplate.query("SELECT `id`, `emp_name` FROM `employees` ORDER BY `emp_name`",
//				(resultSet, i) -> new Employee(resultSet.getLong("id"), resultSet.getString("emp_name")));
//		System.out.println(employees);
//	}
}
