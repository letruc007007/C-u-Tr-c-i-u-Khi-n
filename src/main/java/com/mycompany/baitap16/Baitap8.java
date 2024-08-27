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
public class Baitap8 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen duong N: ");
        int N = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;  
        }

        System.out.println("Tong cac so tu 1 đen " + N + " la: " + sum);
    }
    
}
