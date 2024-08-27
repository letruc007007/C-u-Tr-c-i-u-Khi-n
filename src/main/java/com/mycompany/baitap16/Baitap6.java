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
public class Baitap6 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print("Nhap so nguyen thu nhat: ");
        int num1 = sr.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int num2 = sr.nextInt();
        System.out.print("Nhap phep toan (+, -, *, /): ");
        char operator = sr.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Ket qua: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Ket qua: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Ket qua: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Ket qua: " + ((double) num1 / num2));
                } else {
                    System.out.println("Khong the chia cho 0!!");
                }
                break;
            default:
                System.out.println("Phep toan khong hop le.");
                break;
        }
    }
}
