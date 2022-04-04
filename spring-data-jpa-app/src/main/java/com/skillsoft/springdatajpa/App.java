package com.skillsoft.springdatajpa;

import com.skillsoft.springdatajpa.config.JpaConfig;
import com.skillsoft.springdatajpa.entity.EmployeeEntity;
import com.skillsoft.springdatajpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;
import java.awt.*;
import java.util.ArrayList;

@Configuration("mainBean")
@EnableJpaRepositories(basePackages = "com.skillsoft.springdatajpa.repository")
@Import(JpaConfig.class)
public class App {
    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private DataSource dataSource;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(App.class);
        ctx.refresh();
        App app = (App) ctx.getBean("mainBean");
        app.addEmployees();
        ctx.close();
    }

    private void addEmployees() {
        ArrayList<EmployeeEntity> employeeEntityList = new ArrayList<EmployeeEntity>();
        employeeEntityList.add(new EmployeeEntity("Roberto",2));
        employeeEntityList.add(new EmployeeEntity("Sharon",4));
        employeeEntityList.add(new EmployeeEntity("Juan",2));
        employeeEntityList.add(new EmployeeEntity("Rogelio",1));
        repository.saveAll(employeeEntityList);
    }
}
