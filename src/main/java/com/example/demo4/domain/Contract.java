package com.example.demo4.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Contract {
    @Id
    Long id;

    String term;
    String document; //게약서 완성본 (DB 박으로 뺄것..)
    String receiving; //수납정보
    String aaa;

}
