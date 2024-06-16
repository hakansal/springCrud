package com.example.springcrud;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@RequestMapping("/Api")
@EnableSwagger2
public class controll {

    @Autowired
    private service service1;

    @RequestMapping( "/save")
    public ResponseEntity<test>addtest(@RequestBody test test){
        test addtest=service1.add(test);
        return new ResponseEntity<test>(addtest, HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<List<test>>getall(){
        List<test>
                all=service1.find();
        return new ResponseEntity<List<test>>(all,HttpStatus.OK);
    }
    @RequestMapping("/{id}")
    public ResponseEntity<test> getid(@PathVariable ("id")Long id){
        test test1=service1.gettest(id);
        return new ResponseEntity<test>(test1,HttpStatus.OK);
    }
    @RequestMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id")Long id){
        service1.deletetest(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
    @GetMapping("/normal")
    public String mes(){
        return "messa";
    }
}
