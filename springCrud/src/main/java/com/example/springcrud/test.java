package com.example.springcrud;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@ToString
public class test {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long İd;

    private String Name;
    private String SurName;

}
