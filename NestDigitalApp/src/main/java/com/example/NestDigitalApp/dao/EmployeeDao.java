package com.example.NestDigitalApp.dao;

import com.example.NestDigitalApp.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query(value = "SELECT `id`, `designation`, `empcode`, `mail`, `name`, `password`, `phn_no`, `salary`, `username` FROM `employee` WHERE `empcode`=:empcode", nativeQuery = true)
    List<Employee> SearchEmployee(@Param("empcode") Integer empcode);


    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `employee` WHERE `id`=:id", nativeQuery = true)
    void deleteEmployee(@Param("id") Integer id);

    @Query(value = "SELECT `id`, `designation`, `empcode`, `mail`, `name`, `password`, `phn_no`, `salary`, `username` FROM `employee` WHERE `id`= :id",nativeQuery = true)
    List viewEmployee(@Param("id")Integer id);
}