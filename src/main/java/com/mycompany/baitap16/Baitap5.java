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
public class Baitap5 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print("Nhap so km đi taxi: ");
        double km = sr.nextDouble();

        double fare = 0;

        if (km <= 1) {
            fare = 15000;
        } else if (km <= 5) {
            fare = 15000 + (km - 1) * 13500;
        } else {
            fare = 15000 + 4 * 13500 + (km - 5) * 11000;
        }

        if (km > 120) {
            fare *= 0.9; // Giảm 10%
        }

        System.out.printf("Tien taxi la: %.0f đ\n", fare);
    }
}
