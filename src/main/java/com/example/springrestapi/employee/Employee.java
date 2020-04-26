package com.example.springrestapi.employee;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "Employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @NotNull(message = "The name cannot be null.")
    @NotBlank(message = "The name cannot be empty.")
    private String name;

    @NotNull(message = "The role cannot be null.")
    @NotBlank(message = "The role cannot be empty.")
    private String role;

    protected Employee() {}

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
