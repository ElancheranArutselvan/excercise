package com.elan.exercise.Controller;

import com.elan.exercise.Entity.ManyToMany.Aspirant;
import com.elan.exercise.Entity.ManyToMany.Course;
import com.elan.exercise.Repository.AspirantRepository;
import com.elan.exercise.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aspirantCourse")
public class AspirantCourseController {

    @Autowired
    private AspirantRepository aspirantRepository;
    @Autowired
    private CourseRepository courseRepository;

    public AspirantCourseController(AspirantRepository aspirantRepository, CourseRepository courseRepository){
        this.aspirantRepository =aspirantRepository;
        this.courseRepository=courseRepository;
    }
    @PostMapping("/save")
    public Aspirant saveAspirantWithCourse(@RequestBody Aspirant aspirant){
        return aspirantRepository.save(aspirant);
    }

    @GetMapping("/getAll")
    public List<Aspirant> getAll(){
        return aspirantRepository.findAll();
    }

    @GetMapping("/{aspirantId}")
    public Aspirant getById(@PathVariable long aspirantId){
        return aspirantRepository.findById(aspirantId).orElse(null);
    }
    @GetMapping("/{name}")
    public List<Aspirant> getAspirantByName(@PathVariable String name){
        return aspirantRepository.findByName(name);
    }
    @GetMapping("/{fee}")
    public List<Course> getByFees(@PathVariable double fee){
        return courseRepository.getByFeesLessThan(fee);
    }
}
