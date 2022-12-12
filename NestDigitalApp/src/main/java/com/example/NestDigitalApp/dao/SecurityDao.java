package com.example.NestDigitalApp.dao;

import com.example.NestDigitalApp.model.Employee;
import com.example.NestDigitalApp.model.Security;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SecurityDao extends CrudRepository<Security,Integer> {

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `security` WHERE `id`=:id",nativeQuery = true)
    void deleteSecurity(@Param("id")Integer id);

    @Query(value = "SELECT `id`, `secempcode`, `secmail`, `secname`, `secpassword`, `secphn_no`, `secsalary`, `secusername` FROM `security` WHERE `secempcode`=:secempcode",nativeQuery = true)
    List<Security> SearchSecurity(@Param("secempcode")Integer secempcode);

    @Query(value = "SELECT `id`, `secempcode`, `secmail`, `secname`, `secpassword`, `secphn_no`, `secsalary`, `secusername` FROM `security` WHERE `id`=:id",nativeQuery = true)
    List<Security>viewSecurity(@Param("id")Integer id);
}
