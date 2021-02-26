package employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringBootApplication
public class EmployeesSpringBootApplication implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(EmployeesSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Employee> names = jdbcTemplate.query("select id, emp_name from employees", (resultSet, i) -> new Employee(resultSet.getLong("id"), resultSet.getString("emp_name")));
        System.out.println(names);

        jdbcTemplate.update("insert into employees(emp_name) values (?)", "Jane Spring Boot Doe");
    }

}
