package com.example.springjpaedu;

import com.example.springjpaedu.entity.Emp;
import com.example.springjpaedu.repository.StudyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class JPA_StudyRepository {
    @Autowired
    private StudyRepository studyRepository;

    @Test
    public void test(){
        List<Emp> list = new ArrayList<>();
        list = studyRepository.findByJob("SALESMAN");
        list.stream().forEach(System.out::println);

    }

}
