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
public class Baitap10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println(n + " khong phai so nguyen to.");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(n + " la so nguyen to.");
            } else {
                System.out.println(n + " khong phai so nguyen to.");
            }
        }
    }
}
