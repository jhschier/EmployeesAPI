package com.northwind_api.rest_api.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")
public class Employee {

    @Id
    @Column(name = "employee_id")
    private Integer id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "title")
    private String title;

    @Column(name = "title_of_courtesy")
    private String courtesy;

    @Column(name = "birth_date")
    private LocalDate birth;

    @Column(name = "hire_date")
    private LocalDate hire;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "postal_code")
    private String code;

    @Column(name = "extension")
    private String extension;

    @Column(name = "reports_to")
    private String reportsTo;

    @Column(name = "region")
    private String region;

    @Column(name = "country")
    private String country;

    @Column(name = "home_phone")
    private String homePhone;

    @Column(name = "notes")
    private String notes;
}
