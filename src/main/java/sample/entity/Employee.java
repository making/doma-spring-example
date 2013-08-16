package sample.entity;

import java.math.BigDecimal;
import java.sql.Date;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Version;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_UPPER_CASE)
public class Employee {

	@Id
	public Integer employeeId;

	public String employeeName;

	public Date hiredate;

	public BigDecimal salary;

	@Version
	public Integer versionNo;

}