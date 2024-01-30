package _02_control_statement;

import java.util.Scanner;

public class PracMethod {
    public static void main(String[] args) {
        System.out.println("공백으로 구분하여 숫자 두 개를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();

        System.out.println("===결과===");
        System.out.println("덧셈 결과 : " + sum(a, b));
        System.out.println("뺄셈 결과 : " + minus(a, b));
        System.out.println("나눗셈 결과 : " + mul(a, b));
        System.out.println("곱셈 결과 : " + divide(a, b));

        PracMethod ol = new PracMethod();
        System.out.println("원의 넓이 : " + ol.cal(5));
        System.out.println("직사각형의 넓이 : " + ol.cal(10.0,7));
        System.out.println("삼각형의 넓이 : " + ol.cal(6,3));

    }
    public static double sum(double a, double b){return a + b;}
    public static double minus(double a, double b){return a - b;}
    public static double mul(double a, double b){return a * b;}
    public static double divide(double a, double b){return a / b;}

    public double cal(double a){return a * a * 3.14;}
    public double cal(double a, double b){return a * b;}
    public int cal(int a, int b){return (a * b) /2;}
}
