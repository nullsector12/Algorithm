package daily_Algorithm;

import java.util.Scanner;

/*
 *  2021. 01. 05 Daily Algorithm
 *  Day73 - Programmers Cording Test Level 1
 *  직사각형 별찍기
 *
 */

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0; i<b; i++){
            for(int j=0; j<a; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // System.out.println(a + b);
    }
}