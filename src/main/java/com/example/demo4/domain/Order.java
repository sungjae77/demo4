package com.example.demo4.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Order {
    @Id
    private Long id;

    String name;
    String tel;
    String mobile;
    String ci;
    String di;
    String safekey;
    String address;
    String zip;

    //상품
    String productId; // 주문-상품  1:M  상품이 외부 MSA ~ 내부 복제본...
    String productSeq; //주문-상품  1:M  상품이 외부 MSA ~ 내부 복제본...
    String orderType; //(렌탈, 일시불)
    
    //제품 약어
    String abbreviation;

    //주문 ~ 계약 : 1:M
    String contractId;

}
