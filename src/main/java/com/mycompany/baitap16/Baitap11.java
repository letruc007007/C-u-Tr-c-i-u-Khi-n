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
public class Baitap11 {
public static void main(String[] args) {
int n;
int sodao;

Scanner sc = new Scanner(System.in);

System.out.print("Cho biet n:");
n = sc.nextInt();

sodao = TimSoDao(n);
if(sodao==n)
{
System.out.println(n +" la doi xung");
}else
{
System.out.println(n + " la so khong doi xung");
}
}
//Định nghĩa hàm tìm số đảo của 1 số nguyên
private static int TimSoDao(int n) {
int sodao=0;
while (n>0) {
sodao = sodao*10 + n%10;
n = n/10;
}
return sodao;
}
}
