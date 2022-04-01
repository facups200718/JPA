package com.skillsoft.springdatajpa.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class EmployeeEntity {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private int level;

    @Override
    public String toString() {
        return "Employee (" + this.getId() + ", " + this.getName() + ", " + this.getLevel() + ")";
    }
}
