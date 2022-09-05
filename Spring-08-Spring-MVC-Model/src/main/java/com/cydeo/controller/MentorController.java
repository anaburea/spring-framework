package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {

    @RequestMapping("/list")
    public String showTable(Model model) {

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike", "Smith", 25, Gender.MALE));
        mentorList.add(new Mentor("Triss", "Sorel", 33, Gender.FEMALE));
        mentorList.add(new Mentor("Ivan", "Ivanov", 18, Gender.MALE));
        mentorList.add(new Mentor("Ana Maria", "Russu", 25, Gender.FEMALE));
        mentorList.add(new Mentor("Mike", "Smith", 25, Gender.MALE));
        model.addAttribute("mentors", mentorList);

        return "mentor/mentor-list";

    }

}
