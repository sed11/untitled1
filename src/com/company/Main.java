package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 int sum = 0;
        String s =scanner.nextLine();
        int n = s.length();
        int num = Integer.parseInt(s);
        for( int i = 0; i < n; i++) {
         sum = sum + num %10;
         num = num/ 10;

        }
System.out.println(sum);
    }
}