package com.neutroline.java.lab;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you number: ");
        int num = sc.nextInt();
        int num1 = num;
        int fact = 1;
        while (num>0){
           fact = fact * num;
           num--;

        }
        System.out.println("Factorial of "+num1+" is "+ fact);

    }
}
