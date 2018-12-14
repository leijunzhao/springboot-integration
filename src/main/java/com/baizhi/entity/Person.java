package com.baizhi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "people")
public class Person implements Serializable {
    @Id
    private Integer id;
    private String name;
    private String mobile;
    private String email;
    private String city;
    @JsonFormat(pattern = "yyyy-MM-dd")

    private Date birthday;
}
