package com.skillsoft.springdatajpa.repository;

import com.skillsoft.springdatajpa.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

//El Long sería la PK de nuestra instancia de empleado
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long> {
}
