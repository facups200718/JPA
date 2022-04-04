package com.skillsoft.springdatajpa.entity;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
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
@AllArgsConstructor
public class EmployeeEntity {
    @Id
    @Nullable
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
