package sample;

import java.math.BigDecimal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import sample.entity.Employee;
import sample.service.EmployeeService;

public class Main {
	public static void main(String[] args) throws Exception {
		try (GenericApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanConfig.class)) {
			EmployeeService employeeService = applicationContext
					.getBean(EmployeeService.class);
			System.out.println(employeeService);

			// 主キーでエンティティを検索
			Employee employee = employeeService.selectById(1);

			// エンティティのプロパティを変更
			employee.employeeName = "KING";
			employee.salary = employee.salary.add(new BigDecimal(1000));

			// エンティティを更新
			employeeService.update(employee);
		}
	}
}
