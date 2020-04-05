package com.example.elkdemo.vo;

import com.example.elkdemo.po.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenfu
 * @Date 2019/12/12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeVo {

    private int id = 1;
    private String name;

    public EmployeeVo(Employee employee) {
        this.id = employee.getId();
        this.name = employee.getName();
    }

    public static void main(String[] args) {
        EmployeeVo employeeVo = new EmployeeVo();
        employeeVo.setId(2);
        System.out.println(employeeVo.getId());
        String aa = "a.b.c.%b";
        String text = String.format(aa, true);
        System.out.println(text);
        text.equalsIgnoreCase("");
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
