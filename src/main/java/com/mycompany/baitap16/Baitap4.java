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
public class Baitap4 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print("Nhap so nguyen: ");
        int number = sr.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " la so chan.");
        } else {
            System.out.println(number + " la so le.");
        }
    }
}
