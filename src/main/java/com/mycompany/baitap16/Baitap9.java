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
public class Baitap9 { 
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print("Nap so nguyen duong N: ");
        int N = sr.nextInt();

        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
        }

        System.out.println("So uoc so cua " + N + " la: " + count);
    }
}
