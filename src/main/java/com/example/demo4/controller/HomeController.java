package com.example.demo4.controller;

import com.example.demo4.domain.Member;
import com.example.demo4.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/")
    private String home(){
        return "{'aaa':'hello'}";
    }

    @RequestMapping("/init")
    private String init(){
        Member member1 = new Member();
        member1.setId(1L);
        member1.setName("배성진 수석");
        memberService.update(member1);

        Member member2 = new Member();
        member2.setId(2L);
        member2.setName("김성식 차장");
        memberService.update(member2);

        Member member3 = new Member();
        member3.setId(3L);
        member3.setName("정석희 수석");
        memberService.update(member3);

        return "초기화";
    }

    @RequestMapping("/members")
    private List<Member>  findAll(){
        //-------------------------------------------------------------------
        // return type String 에서 List<Member> 로 수정하면.
        // Gson 없이 @RestController 자체에서도 json 으로 응답을 하므로 문제가 안됨
        //-------------------------------------------------------------------
        List<Member> members = memberService.findAll();
        //Gson gson = new Gson();
        //return gson.toJson(members);
        //return members.toString();
        return members;
    }
}