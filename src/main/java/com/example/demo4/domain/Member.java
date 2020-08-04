package com.example.demo4.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Member {
    @Id
    Long id;
    String name;
    String cell;
}
