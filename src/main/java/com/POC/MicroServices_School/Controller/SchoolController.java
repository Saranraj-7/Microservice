package com.POC.MicroServices_School.Controller;

import com.POC.MicroServices_School.Entity.School;
import com.POC.MicroServices_School.Service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SchoolController {
    @Autowired
    SchoolService schoolService;

    @PostMapping("/school")
    public School createSchool(School school){
        return schoolService.createSchool(school);
    }
}
