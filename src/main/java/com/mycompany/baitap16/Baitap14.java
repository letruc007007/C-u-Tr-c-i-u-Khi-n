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
public class Baitap14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Nhap vao mot so (nhap ko de dung lai): ");
            double number = scanner.nextDouble();

            if (number == 0) {
                break;
            }

            sum += number;
            count++;
        }

        if (count == 0) {
            System.out.println("Khong co so nao nhap.");
        } else {
            double average = sum / count;
            System.out.printf("Trung binh các so vua nhap: %.3f%n", average);
        }
    }
}
