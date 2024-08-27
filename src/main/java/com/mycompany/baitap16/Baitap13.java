/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap16;

/**
 *
 * @author Administrator
 */
public class Baitap13 {
    public static void main(String[] args) {
        System.out.println("Cac so thoa man đieu kien:");

        for (int num = 10; num <= 99; num++) {
            int a = num / 10;  
            int b = num % 10; 

            if (a * b == 2 * (a + b)) {
                System.out.println(num);
            }
        }
    }
}