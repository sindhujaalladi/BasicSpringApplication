package com.basicspringapp.pojo;


import lombok.AllArgsConstructor;
import lombok.*;
import java.io.*;
import lombok.NoArgsConstructor;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetails implements Serializable {

    private int id;
    private String name;
    private String departmentname;
    private String collegename;

}
