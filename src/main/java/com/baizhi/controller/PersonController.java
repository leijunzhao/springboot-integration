package com.baizhi.controller;

import com.baizhi.entity.Person;
import com.baizhi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {
    @Autowired
    PersonService personService;
    @RequestMapping("selectAllPerson")
    public List<Person> selectAllPerson(){
        //查所有人的集合
        List<Person> personList = personService.queryAllPerson();
        return personList;
    }
}
