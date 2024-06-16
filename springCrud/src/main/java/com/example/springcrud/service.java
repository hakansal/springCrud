package com.example.springcrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service {

    @Autowired
    private repo rep1;

    public test add(test test){
        return rep1.save(test);
    }
    public List<test> find(){

        return rep1.findAll();
    }

    public test gettest(Long id){
        return rep1.findById(id).get();

    }

    public void  deletetest(Long id){
         rep1.deleteById(id);
    }
}
