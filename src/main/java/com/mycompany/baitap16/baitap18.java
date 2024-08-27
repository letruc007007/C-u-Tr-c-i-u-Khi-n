/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap16;
import java.util.Scanner;

public class baitap18 {
    
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int n;
        do {
            System.out.print("Nhập số lượng phần tử của mảng (1 ≤ n ≤ 50): ");
            n = scanner.nextInt();
        } while (n < 1 || n > 50);

        
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        
        System.out.println("Mảng vừa nhập:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        System.out.println("Các phần tử không phải số nguyên tố trong mảng:");
        for (int i = 0; i < n; i++) {
            if (!isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        int primeSum = 0;
        int primeCount = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                primeSum += arr[i];
                primeCount++;
            }
        }
        
        if (primeCount > 0) {
            double primeAverage = (double) primeSum / primeCount;
            System.out.println("Giá trị trung bình của các phần tử là số nguyên tố: " + primeAverage);
        } else {
            System.out.println("Không có số nguyên tố trong mảng để tính giá trị trung bình.");
        }
    }
}