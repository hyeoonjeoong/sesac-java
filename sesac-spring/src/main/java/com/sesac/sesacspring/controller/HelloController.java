package com.sesac.sesacspring.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
//@Controller : 해당 클래스가 controller의 역할을 하는 클래스라는 것을
//spring  container 에게 알려준다.

public class HelloController {

    @GetMapping("/hi")
    //URL을 매핑시켜준다.
    //클라이언트가 /hi라는 경로로 GET method로 접근한다면 아래 메소드를 실행시켜라.
    public String getHi(Model model){
        //Model : Controller 안의 메소드가 파라미터로 받을 수 있는 객체 중 하나
        //Model 안에 정보를 담아서 view로 전달
        //IoC : 개발자가 직접 mnodel을 생성x

        model.addAttribute("name", "홍길동");
        model.addAttribute("name2", "<strong>코딩온</strong>");

        model.addAttribute("age1", 10);
        model.addAttribute("age2", 20);

        String[] x = {"a", "b", "c", "d", "e"};
        model.addAttribute("item1", x);
        char[] alphabetArray = new char[26];
        char alphabet = 'A';

        for (int i = 0; i < 26; i++) {
            alphabetArray[i] = alphabet;
            alphabet++;
        }
        model.addAttribute("item2", alphabetArray);




        return "hi"; //템플릿 파일의 이름이다.
        //nodejs로 비유하면 > res.render("hi) 인 것.
        //res.render("hi", {name:"홍길동"} -> x
    }

    @GetMapping("/people")
    public String getpeople(Model model){
        ArrayList<Person>
    }
}
