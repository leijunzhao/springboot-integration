package com.baizhi.serviceImpl;

import com.baizhi.entity.Person;
import com.baizhi.mapper.PersonMapper;
import com.baizhi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonMapper personMapper;
    public List<Person> queryAllPerson(){
        List<Person> personList = personMapper.selectAll();
        return personList;
    }
}
