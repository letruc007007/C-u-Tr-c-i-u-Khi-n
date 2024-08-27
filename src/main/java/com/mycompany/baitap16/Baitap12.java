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
public class Baitap12  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên dương n (n > 0): ");
        int n = scanner.nextInt();

        int maxDigit = 0;
        int minDigit = 9;

        while (n > 0) {
            int digit = n % 10;  
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            if (digit < minDigit) {
                minDigit = digit;
            }
            n = n / 10;  
        }

        System.out.println("Chu so lon nhat: " + maxDigit);
        System.out.println("Chu so nho nhat: " + minDigit);
    }
}
