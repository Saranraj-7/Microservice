package com.POC.MicroServices_School.Service;

import com.POC.MicroServices_School.Entity.School;
import com.POC.MicroServices_School.Repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {
    @Autowired
    SchoolRepository schoolRepository;

    public School createSchool(School school){
        return schoolRepository.save(school);
    }
}
