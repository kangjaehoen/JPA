package com.example.springjpaedu.controller;

import com.example.springjpaedu.entity.Emp;
import com.example.springjpaedu.repository.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudyController {
    @Autowired
    private StudyRepository studyRepository;

    @GetMapping("/study")
    public String findByJob(String job, Model model){
        List<Emp> list = studyRepository.findByJob(job);
        model.addAttribute("list",list);
        return "study";
    }
}
