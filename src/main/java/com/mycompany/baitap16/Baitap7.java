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
public class Baitap7 {
    public static void main(String[] args) {
int thang, nam;
int songay=0;
Scanner sc = new Scanner(System.in);

System.out.println("====CHUONG TRINH TINH SO NGAY CUA THANG====");
System.out.print("Cho biet thang:");
thang = sc.nextInt();
System.out.print("Cho biet nam:");
nam = sc.nextInt();

switch (thang) {
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
songay=31;
break;
case 2:
if(nam%4==0)
{
songay=29;
}else{
songay=28;
}
break;
case 4:
case 6:
case 9:
case 11:
songay=30;
break;
default:
System.out.println("Thang khong hop le");
}

System.out.println("Thang " + thang + " co " + songay + " ngay");
}
}
