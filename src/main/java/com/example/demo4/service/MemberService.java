package com.example.demo4.service;

import com.example.demo4.domain.Member;

import java.util.List;

public interface MemberService {

    List<Member> findAll();

    void update(Member member);

    void delete(Member member);

}
