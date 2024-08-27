/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap16;
import java.util.Scanner;

public class battao17{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số lượng phần tử của mảng (1 ≤ n ≤ 20): ");
            n = scanner.nextInt();
        } while (n < 1 || n > 20);
        double[] arr = new double[n];
        
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextDouble();
        }
        
        System.out.println("Mảng vừa nhập:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double average = sum / n;
        System.out.println("Trung bình giá trị của mảng: " + average);

        double min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Phần tử có giá trị nhỏ nhất trong mảng: " + min);
    }
    public static void nhapMang(int[] a, Scanner sc) {
for (int i = 0; i < a.length; i++) {
System.out.print("Cho biet gia tri a[" + i + "]:");
a[i] = sc.nextInt();
}
}
public static void xuatMang(int[] a) {
for (int x : a) {
System.out.print(x + " ");
}
}

public static int tinhTong(int[] a) {
int sum = 0;
for (int x : a) {
sum += x; //s=s+x;
}
return sum;
}
}