package sample.service;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import sample.BeanConfig;
import sample.entity.Employee;

import java.math.BigDecimal;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class EmployeeServiceTest {
    @Test
    public void testUpdate() throws Exception {
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
            int updated = employeeService.update(employee);
            assertThat(updated, is(1));
        }
    }


}
