package _02_control_statement;

import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
        //-----실습 1
        System.out.println("나이를 입력해주세요. >>");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();


        if (age >= 1 && age <= 7) {
            System.out.println("유아");
        } else if (age >= 8 && age <= 13) {
            System.out.println("초등학생");
        } else if (age >= 14 && age <= 16) {
            System.out.println("중학생");
        } else if (age >= 17 && age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

        //-----실습 2
        System.out.println("이름을 입력해주세요. >> ");
        String name = scanner.next();

        if(name.equals("홍길동")){
            System.out.println("남자!");
        } else if (name.equals("성춘향")) {
            System.out.println("여자!");
        } else {
            System.out.println("모르겠어요!");
        }

        String gender;
        gender = switch (name) {
            case "홍길동" -> "남자!";
            case "성춘향" -> "여자!";

            default -> "모르겠어요!";
        };
        System.out.println(gender);
    }
 }