package com.example.elkdemo.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenfu
 * @Date 2019/12/12
 */
@Data
@AllArgsConstructor
//@NoArgsConstructor
public class Employee {
    private int id;
    private String name;

    public Employee() {
    }
}
