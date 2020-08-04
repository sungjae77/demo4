package com.example.demo4.controller;

import com.example.demo4.domain.Member;
import com.example.demo4.service.MemberService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    MemberService memberService;

    @RequestMapping("/")
    String home(){
        return "{'aaa':'hello'}";
    }

    @RequestMapping("/init")
    String init(){
        Member member1 = new Member();
        member1.setId(1L);
        member1.setName("배성진");
        memberService.update(member1);

        Member member2 = new Member();
        member2.setId(2L);
        member2.setName("배성진");
        memberService.update(member2);

        return "초기화";
    }

    @RequestMapping("/members")
    String findAll(){
        List<Member> members = memberService.findAll();
        Gson gson = new Gson();
        return gson.toJson(members);

        //return members.toString();
    }
}
