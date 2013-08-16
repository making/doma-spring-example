package sample.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import sample.InjectConfig;
import sample.entity.Employee;

@Dao
@InjectConfig
public interface EmployeeDao {

	@Select
	Employee selectById(Integer employeeId);

	@Update
	int update(Employee employee);
}
