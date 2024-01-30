package _03_array;

import java.util.Scanner;

public class PracArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("실습 1 - 5개의 정수를 입력하세요.");

        int sum = 0;
        int[]arr = new int[5];

        for(int i = 0; i <5; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println((double) sum/5);
    }
}
