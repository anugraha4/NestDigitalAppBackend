package com.example.NestDigitalApp.dao;

import com.example.NestDigitalApp.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

@Query(value = "SELECT `id`, `designation`, `empcode`, `mail`, `name`, `password`, `phn_no`, `salary`, `username` FROM `employee` WHERE `empcode`=:empcode",nativeQuery = true)
    List<Employee>SearchEmployee(@Param("empcode")Integer empcode);
}
