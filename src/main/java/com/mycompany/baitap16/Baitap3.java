/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap16;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Baitap3 { 
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print("Nhập số nguyên thứ nhất: ");
        int num1 = sr.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int num2 = sr.nextInt();
        System.out.print("Nhập số nguyên thứ ba: ");
        int num3 = sr.nextInt();

        int min = num1; 

        if (num2 < min) {
            min = num2;
        }

        if (num3 < min) {
            min = num3;
        }

        System.out.println("Số nhỏ nhất là: " + min);
    }
}
