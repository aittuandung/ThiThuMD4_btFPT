package com.btfpt.repository;

import com.btfpt.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepo extends CrudRepository<Employee, String> {
}
