package com.sesac.sesacspring.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller


    public String getPeople(Model model){
    @GetMapping("/people")
        public class PeopleController {
            String name;
            int age;

            public PeopleInfo(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public static void main(String[] args) {
                PeopleInfo[] arrayObj = new PeopleInfo[2];

                arrayObj[0] = new PeopleInfo("kim", 10);
                arrayObj[1] = new PeopleInfo("lee", 20);
            }
        }



        return "people"; //템플릿 파일의 이름이다.


}
