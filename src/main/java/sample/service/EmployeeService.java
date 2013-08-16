package sample.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sample.dao.EmployeeDao;
import sample.entity.Employee;

@Service
public class EmployeeService {

	@Inject
	protected EmployeeDao employeeDao;

	public Employee selectById(Integer employeeId) {
		return employeeDao.selectById(employeeId);
	}

	@Transactional
	public int update(Employee employee) {
		return employeeDao.update(employee);
	}

}
